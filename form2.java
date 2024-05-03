import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form2 extends JFrame implements ActionListener {
    JPanel p;
    JLabel l2, l3, l4, l;
    JTextField un, pw, captchaInput;
    JButton b1, b2, b3;
    ImageIcon img;

    form2() {
        super("Sign In");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with a BorderLayout to hold the background image
        p = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load and draw the background image
                Image image = new ImageIcon("login.png").getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Create a panel to hold the login components
        JPanel loginPanel = new JPanel();
        loginPanel.setOpaque(false); // Make the panel transparent
        loginPanel.setLayout(null);

        // Set the layout null for absolute positioning of components


        l2 = new JLabel("User Name");
        l2.setFont(new Font("Verdana", Font.BOLD, 15));
        l2.setForeground(Color.BLACK);
        l2.setBounds(410, 200, 150, 30);
        loginPanel.add(l2);

        l3 = new JLabel("Password");
        l3.setFont(new Font("Verdana", Font.BOLD, 15));
        l3.setForeground(Color.BLACK);
        l3.setBounds(410, 250, 350, 30);
        loginPanel.add(l3);

        un = new JTextField();
        un.setFont(new Font("Verdana", Font.PLAIN, 18));
        un.setBounds(510, 200, 200, 30);
        loginPanel.add(un);

        pw = new JPasswordField();
        pw.setFont(new Font("Verdana", Font.PLAIN, 18));
        pw.setBounds(510, 250, 200, 30);
        loginPanel.add(pw);

        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        int result = Math.abs(num1 - num2);

        l4 = new JLabel("Captcha: " + num1 + " - " + num2 + " = ");
        l4.setFont(new Font("Verdana", Font.BOLD, 15));
        l4.setForeground(Color.BLACK);
        l4.setBounds(400, 360, 200, 30);
        loginPanel.add(l4);

        captchaInput = new JTextField();
        captchaInput.setFont(new Font("Verdana", Font.PLAIN, 18));
        captchaInput.setBounds(560, 360, 113, 30);
        loginPanel.add(captchaInput);

        b1 = new JButton("Back");
        b1.setBounds(100, 470, 100, 30);
        b1.setBackground(new Color(46, 204, 113));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Verdana", Font.BOLD, 16));
        b1.setFocusPainted(false);
        b1.addActionListener(this);
        loginPanel.add(b1);

        b2 = new JButton("Log In");
        b2.setBounds(550, 470, 100, 30);
        b2.setBackground(new Color(46, 204, 113));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Verdana", Font.BOLD, 16));
        b2.setFocusPainted(false);
        b2.addActionListener(this);
        loginPanel.add(b2);

        // Add the login panel to the center of the background panel
        p.add(loginPanel, BorderLayout.CENTER);

        this.add(p);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b2) {
            int userResult = Integer.parseInt(captchaInput.getText());
            int num1 = Integer.parseInt(l4.getText().split(": ")[1].split(" ")[0]);
            int num2 = Integer.parseInt(l4.getText().split(": ")[1].split(" ")[2]);
            int actualResult = Math.abs(num1 - num2);

            if (userResult == actualResult) {
                String userName = un.getText();
                String userPassword = pw.getText();
                CreateAccount createAccount = new CreateAccount();

                if (createAccount.getAccount(userName, userPassword)) {
                    JOptionPane.showMessageDialog(null, "Login Successful");

                    form4 f = new form4();
                    this.setVisible(false);
                    f.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Check UserName/Password");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect captcha. Please try again.");
            }
        } else if (ae.getSource() == b1) {
            form f = new form();
            this.setVisible(false);
            f.setVisible(true);
        }
    }
}
