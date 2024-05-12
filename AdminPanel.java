import javax.swing.*;
import java.awt.*;
import java.io.*;

public class AdminPanel extends BaseFrame {
    JPanel panel;
    JLabel label;

    AdminPanel() {
        super("Admin Panel");


        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(240, 240, 240)); 

        label = new JLabel("Registered Users:");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label, BorderLayout.NORTH);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        
        try {
            File file = new File("bin\\files\\Users.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split("\t");
                textArea.append("Name: " + userData[3] + "\n"); 
                textArea.append("Password: " + userData[1] + "\n");
                textArea.append("NID: " + userData[2] + "\n");
                textArea.append("Username: " + userData[0] + "\n");
                textArea.append("Email: " + userData[4] + "\n\n");
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage());
        }

        this.add(panel);
    }

    public static void main(String[] args) {
        AdminPanel adminPanel = new AdminPanel();
        adminPanel.setVisible(true);
    }
}
