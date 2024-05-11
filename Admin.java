import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Admin extends BaseFrame implements ActionListener {
    JPanel p;
    JLabel l, l1;
    JTextField tf;
    JPasswordField pf;
    JButton b;

    Admin() {
        super("Admin Login");


        p = new JPanel();
        p.setSize(new Dimension(400, 300));
        p.setBackground(new Color(123, 104, 238)); 
        p.setLayout(null);

        l1 = new JLabel("Admin Login");
        l1.setFont(new Font("Arial", Font.BOLD, 20)); 
        l1.setForeground(new Color(255, 255, 255)); 
        l1.setBounds(130, 10, 150, 50);
        l1.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); 
        p.add(l1);

        l = new JLabel("Username:");
        l.setBounds(50, 80, 100, 30);
        l.setFont(new Font("Arial", Font.BOLD, 14));
        l.setForeground(Color.WHITE);
        p.add(l);

        tf = new JTextField();
        tf.setBounds(160, 80, 150, 30);
        p.add(tf);

        l = new JLabel("Password:");
        l.setBounds(50, 130, 100, 30);
        l.setFont(new Font("Arial", Font.BOLD, 14));
        l.setForeground(Color.WHITE);
        p.add(l);

        pf = new JPasswordField();
        pf.setBounds(160, 130, 150, 30);
        p.add(pf);

        b = new JButton("Login");
        b.setBounds(150, 200, 100, 30);
        b.setBackground(new Color(0, 0, 0)); 
        b.setForeground(Color.WHITE); 
        b.setBorder(BorderFactory.createLineBorder(Color.WHITE)); 
        b.setFont(new Font("Arial", Font.BOLD, 16));
        b.setFocusPainted(false);
        b.addActionListener(this);
        p.add(b);

        this.add(p);
    }

    public void actionPerformed(ActionEvent ae) {
        String username = tf.getText();
        String password = new String(pf.getPassword());

        if (username.equals("admin") && password.equals("admin")) {
            JOptionPane.showMessageDialog(null, "Login successful!");
            
            AdminPanel adminPanel = new AdminPanel();
            this.setVisible(false);
            adminPanel.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password!");
        }
    }

    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.setVisible(true);
    }
}
