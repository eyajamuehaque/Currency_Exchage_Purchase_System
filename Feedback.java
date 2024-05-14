import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Feedback extends JFrame {
    private String name;

    public Feedback(String name) {
        this.name = name;

        setTitle("Feedback");
        setSize(700, 500);  // Adjusted size to fit new components
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(123, 104, 238));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel ratingLabel = new JLabel("Rate your experience (1-5 stars):");
        ratingLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(ratingLabel, gbc);

        JComboBox<Integer> ratingComboBox = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5});
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(ratingComboBox, gbc);

        JLabel commentLabel = new JLabel("Choose a comment:");
        commentLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(commentLabel, gbc);

        String[] comments = {
            "Love the easy navigation!",
            "Great conversion tool, needs more currencies.",
            "Clear and organized app.",
            "Needs resizable window.",
            "Confirm exit please!",
            "Confusing navigation.",
            "Missing functionality guidance.",
            "Fast & smooth, needs loading indicators.",
            "Great base, needs user guide.",
            "Enjoyable, keep improving!"
        };

        JComboBox<String> commentComboBox = new JComboBox<>(comments);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(commentComboBox, gbc);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rating = (int) ratingComboBox.getSelectedItem();
                String comment = (String) commentComboBox.getSelectedItem();
                saveFeedback(name, rating, comment);
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(submitButton, gbc);

        add(panel);
        setVisible(true);
    }

    private void saveFeedback(String name, int rating, String comment) {
        try {
            File feedbackDir = new File("Feedback");
            if (!feedbackDir.exists()) {
                feedbackDir.mkdir();
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(feedbackDir, "feedback.txt"), true));
            writer.write("Name: " + name + "\n");
            writer.write("Rating: " + rating + " stars\n");
            writer.write("Comment: " + comment + "\n");
            writer.write("---------------\n");
            writer.close();

            JOptionPane.showMessageDialog(this, "Thank you for your feedback!");
            dispose();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving feedback. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Feedback("TestUser");
    }
}
