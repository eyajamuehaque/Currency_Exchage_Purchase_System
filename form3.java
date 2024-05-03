import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form3 extends JFrame implements ActionListener {
    JPanel p;
    JLabel l2, l3, l4, l5, l6, l7, l;
    JButton b1, b2;
    JTextField t1, t2, t3, t4, t5, t6;
    ImageIcon img;

    form3() {
        super("Sing Up");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image image = new ImageIcon("signup.png").getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        p.setLayout(null);

        // Removed the background image



        l2 = new JLabel("Full Name");
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        l2.setForeground(Color.BLACK); // Black text color
        l2.setBounds(390, 150, 370, 30);
        p.add(l2);

        l3 = new JLabel("NID");
        l3.setFont(new Font("Arial", Font.BOLD, 18));
        l3.setForeground(Color.BLACK); // Black text color
        l3.setBounds(390, 200, 350, 30);
        p.add(l3);

        l4 = new JLabel("Email");
        l4.setFont(new Font("Arial", Font.BOLD, 18));
        l4.setForeground(Color.BLACK); // Black text color
        l4.setBounds(390, 250, 350, 30);
        p.add(l4);

        l5 = new JLabel("User Name");
        l5.setFont(new Font("Arial", Font.BOLD, 18));
        l5.setForeground(Color.BLACK); // Black text color
        l5.setBounds(390, 300, 350, 30);
        p.add(l5);

        l6 = new JLabel("Password");
        l6.setFont(new Font("Arial", Font.BOLD, 18));
        l6.setForeground(Color.BLACK); // Black text color
        l6.setBounds(390, 350, 350, 30);
        p.add(l6);

        l7 = new JLabel("Confirm Password");
        l7.setFont(new Font("Arial", Font.BOLD, 18));
        l7.setForeground(Color.BLACK); // Black text color
        l7.setBounds(380, 400, 350, 30);
        p.add(l7);

        t1 = new JTextField();
        t1.setFont(new Font("Arial", Font.PLAIN, 18)); // Smaller font size
        t1.setBounds(550, 150, 173, 30);
        p.add(t1);

        t2 = new JTextField();
        t2.setFont(new Font("Arial", Font.PLAIN, 18)); // Smaller font size
        t2.setBounds(550, 200, 173, 30);
        p.add(t2);

        t3 = new JTextField();
        t3.setFont(new Font("Arial", Font.PLAIN, 18)); // Smaller font size
        t3.setBounds(550, 250, 173, 30);
        p.add(t3);

        t4 = new JTextField();
        t4.setFont(new Font("Arial", Font.PLAIN, 18)); // Smaller font size
        t4.setBounds(550, 300, 173, 30);
        p.add(t4);

        t5 = new JPasswordField();
        t5.setFont(new Font("Arial", Font.PLAIN, 18)); // Smaller font size
        t5.setBounds(550, 350, 173, 30);
        p.add(t5);

        t6 = new JPasswordField();
        t6.setFont(new Font("Arial", Font.PLAIN, 18)); // Smaller font size
        t6.setBounds(550, 400, 173, 30);
        p.add(t6);

        b1 = new JButton("Back");
        b1.setBounds(100, 470, 100, 30);
        b1.setBackground(new Color(46, 204, 113)); // Green background color
        b1.setForeground(Color.WHITE); // White text color
        b1.setFont(new Font("Arial", Font.BOLD, 16)); // Modern font
        b1.setFocusPainted(false);
        b1.addActionListener(this);
        p.add(b1);

        b2 = new JButton("Next");
        b2.setBounds(550, 470, 100, 30);
        b2.setBackground(new Color(46, 204, 113)); // Green background color
        b2.setForeground(Color.WHITE); // White text color
        b2.setFont(new Font("Arial", Font.BOLD, 16)); // Modern font
        b2.setFocusPainted(false);
        b2.addActionListener(this);
        p.add(b2);

        this.add(p);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b2) {
            String fullName = t1.getText();
            String nID = t2.getText();
            String userEmail = t3.getText();
            String userName = t4.getText();
            String userPassword = t5.getText();
            String userPasswordConfirm = t6.getText();

            if (fullName.isEmpty() || nID.isEmpty() || userEmail.isEmpty() || userName.isEmpty() || userPassword.isEmpty() || userPasswordConfirm.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields");
            } else if (userPassword.equals(userPasswordConfirm)) {
                CreateAccount createAccount = new CreateAccount(fullName, nID, userEmail, userName, userPassword);
                createAccount.addAccount();
                JOptionPane.showMessageDialog(null, "Account Added");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");

                form f = new form();
                this.setVisible(false);
                f.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Passwords do not match");
            }
        } else if (ae.getSource() == b1) {
            form f = new form();
            this.setVisible(false);
            f.setVisible(true);
        }
    }
}
