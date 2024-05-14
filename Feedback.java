import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Feedback extends JFrame {

    private List<String> feedbackEntries = new ArrayList<>();

    public Feedback() {
        setTitle("Feedback");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(123, 104, 238));

        JLabel nameLabel = new JLabel("Your Name:");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        nameLabel.setBounds(50, 50, 100, 30);
        panel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 18));
        nameField.setBounds(160, 50, 200, 30);
        panel.add(nameField);

        JLabel ratingLabel = new JLabel("Rate your experience (1-5 stars):");
        ratingLabel.setForeground(Color.WHITE);
        ratingLabel.setFont(new Font("Arial", Font.BOLD, 16));
        ratingLabel.setBounds(50, 100, 280, 30);
        panel.add(ratingLabel);

        JComboBox<Integer> ratingComboBox = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5});
        ratingComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        ratingComboBox.setBounds(340, 100, 80, 30);
        panel.add(ratingComboBox);

        JLabel commentLabel = new JLabel("Leave a comment:");
        commentLabel.setForeground(Color.WHITE);
        commentLabel.setFont(new Font("Arial", Font.BOLD, 16));
        commentLabel.setBounds(50, 150, 280, 30);
        panel.add(commentLabel);

        JTextArea commentTextArea = new JTextArea(5, 20);
        commentTextArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(commentTextArea);
        scrollPane.setBounds(50, 180, 370, 80);
        panel.add(scrollPane);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int rating = (int) ratingComboBox.getSelectedItem();
                String comment = commentTextArea.getText();
                saveFeedback(name, rating, comment);
            }
        });
        submitButton.setFont(new Font("Arial", Font.BOLD, 16));
        submitButton.setBounds(50, 280, 100, 30);
        panel.add(submitButton);

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                readFeedbackEntries();
                String selectedEntry = (String) JOptionPane.showInputDialog(null, "Select feedback to update:",
                        "Update Feedback", JOptionPane.PLAIN_MESSAGE, null, feedbackEntries.toArray(), feedbackEntries.get(0));
                if (selectedEntry != null) {
                    int index = feedbackEntries.indexOf(selectedEntry);
                    String name = nameField.getText();
                    int rating = (int) ratingComboBox.getSelectedItem();
                    String comment = commentTextArea.getText();
                    String updatedEntry = "Name: " + name + "\nRating: " + rating + " stars\nComment: " + comment + "\n";
                    updateFeedbackEntry(index, updatedEntry);
                }
            }
        });
        updateButton.setFont(new Font("Arial", Font.BOLD, 16));
        updateButton.setBounds(160, 280, 100, 30);
        panel.add(updateButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                readFeedbackEntries();
                String selectedEntry = (String) JOptionPane.showInputDialog(null, "Select feedback to delete:",
                        "Delete Feedback", JOptionPane.PLAIN_MESSAGE, null, feedbackEntries.toArray(), feedbackEntries.get(0));
                if (selectedEntry != null) {
                    int index = feedbackEntries.indexOf(selectedEntry);
                    deleteFeedbackEntry(index);
                }
            }
        });
        deleteButton.setFont(new Font("Arial", Font.BOLD, 16));
        deleteButton.setBounds(270, 280, 100, 30);
        panel.add(deleteButton);

        add(panel);
        setVisible(true);
    }

    private void readFeedbackEntries() {
        feedbackEntries.clear();
        File feedbackFile = new File("Feedback\\feedback.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(feedbackFile))) {
            String line;
            StringBuilder entry = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                if (line.equals("---------------")) {
                    feedbackEntries.add(entry.toString());
                    entry = new StringBuilder();
                } else {
                    entry.append(line).append("\n");
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading feedback: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateFeedbackEntry(int index, String updatedEntry) {
        if (index >= 0 && index < feedbackEntries.size()) {
            feedbackEntries.set(index, updatedEntry);
            saveAllFeedbackEntries();
        }
    }

    private void deleteFeedbackEntry(int index) {
        if (index >= 0 && index < feedbackEntries.size()) {
            feedbackEntries.remove(index);
            saveAllFeedbackEntries();
        }
    }

    private void saveAllFeedbackEntries() {
        File feedbackFile = new File("Feedback\\feedback.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(feedbackFile))) {
            for (String entry : feedbackEntries) {
                writer.write(entry);
                writer.write("---------------\n");
            }
            JOptionPane.showMessageDialog(this, "Feedback updated successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving feedback: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveFeedback(String name, int rating, String comment) {
        try {
            File feedbackFile = new File("Feedback\\feedback.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(feedbackFile, true));
            writer.write("Name: " + name + "\n");
            writer.write("Rating: " + rating + " stars\n");
            writer.write("Comment: " + comment + "\n");
            writer.write("---------------\n");
            writer.close();

            JOptionPane.showMessageDialog(this, "Thank you for your feedback!");
            dispose();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving feedback: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Feedback();
    }
}
