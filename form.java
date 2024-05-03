import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form extends JFrame implements ActionListener {
    JPanel p;
    JButton b1, b2, b3, adminLoginButton;

    public form() {
        super();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image image = new ImageIcon("currency.png").getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        p.setLayout(null);

        b1 = createStyledButton("Log In", Color.BLACK, Color.BLACK);
        b1.setBounds(320, 230, 160, 40);
        p.add(b1);

        b2 = createStyledButton("Sign Up", new Color(34, 139, 34), Color.GREEN);
        b2.setBounds(320, 280, 160, 40);
        p.add(b2);

        b3 = createStyledButton("Exit", new Color(192, 57, 43), Color.RED);
        b3.setBounds(600, 500, 120, 40);
        p.add(b3);

        adminLoginButton = createStyledButton("Admin Login", new Color(123, 104, 238), new Color(255, 215, 0));
        adminLoginButton.setBounds(470, 500, 120, 40); // Change the color and border color
        p.add(adminLoginButton);

        this.add(p);
    }

    private JButton createStyledButton(String text, Color background, Color border) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);

        // Round the corners of the button
        button.setBorder(BorderFactory.createLineBorder(border, 5, true));
        button.setOpaque(true);
        button.setBackground(background);
        button.setBorderPainted(true);

        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addActionListener(this);
        return button;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            form2 f = new form2();
            f.setVisible(true);
        } else if (ae.getSource() == b2) {
            form3 f = new form3();
            f.setVisible(true);
        } else if (ae.getSource() == b3) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit this program?", "Quit", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        } else if (ae.getSource() == adminLoginButton) {
            Admin adminForm = new Admin();
            adminForm.setVisible(true);
        }
        dispose(); // Close current window after button click
    }

    public static void main(String[] args) {
        form f = new form();
        f.setVisible(true);
    }
}
