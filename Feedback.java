import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Feedback extends JFrame {
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
        submitButton.setBounds(150, 280, 100, 30);
        panel.add(submitButton);

        add(panel);
        setVisible(true);
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
