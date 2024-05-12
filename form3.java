import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form3 extends BaseFrame implements ActionListener {
    private JPanel p;
    private JLabel l2, l3, l4, l5, l6, l7, l;
    private JButton b1, b2;
    private JTextField t1, t2, t3, t4, t5, t6;
    private ImageIcon img;

    form3() {
        super("Sign Up");


        p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image image = new ImageIcon("signup.png").getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        p.setLayout(null);

      

        l2 = new JLabel("Full Name");
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        l2.setForeground(Color.BLACK); 
        l2.setBounds(390, 150, 370, 30);
        p.add(l2);

        l3 = new JLabel("NID");
        l3.setFont(new Font("Arial", Font.BOLD, 18));
        l3.setForeground(Color.BLACK); 
        l3.setBounds(390, 200, 350, 30);
        p.add(l3);

        l4 = new JLabel("Email");
        l4.setFont(new Font("Arial", Font.BOLD, 18));
        l4.setForeground(Color.BLACK); 
        l4.setBounds(390, 250, 350, 30);
        p.add(l4);

        l5 = new JLabel("User Name");
        l5.setFont(new Font("Arial", Font.BOLD, 18));
        l5.setForeground(Color.BLACK); 
        l5.setBounds(390, 300, 350, 30);
        p.add(l5);

        l6 = new JLabel("Password");
        l6.setFont(new Font("Arial", Font.BOLD, 18));
        l6.setForeground(Color.BLACK); 
        l6.setBounds(390, 350, 350, 30);
        p.add(l6);

        l7 = new JLabel("Confirm Password");
        l7.setFont(new Font("Arial", Font.BOLD, 18));
        l7.setForeground(Color.BLACK); 
        l7.setBounds(380, 400, 350, 30);
        p.add(l7);

        t1 = new JTextField();
        t1.setFont(new Font("Arial", Font.PLAIN, 18)); 
        t1.setBounds(550, 150, 173, 30);
        p.add(t1);

        t2 = new JTextField();
        t2.setFont(new Font("Arial", Font.PLAIN, 18)); 
        t2.setBounds(550, 200, 173, 30);
        p.add(t2);

        t3 = new JTextField();
        t3.setFont(new Font("Arial", Font.PLAIN, 18)); 
        t3.setBounds(550, 250, 173, 30);
        p.add(t3);

        t4 = new JTextField();
        t4.setFont(new Font("Arial", Font.PLAIN, 18)); 
        t4.setBounds(550, 300, 173, 30);
        p.add(t4);

        t5 = new JPasswordField();
        t5.setFont(new Font("Arial", Font.PLAIN, 18)); 
        t5.setBounds(550, 350, 173, 30);
        p.add(t5);

        t6 = new JPasswordField();
        t6.setFont(new Font("Arial", Font.PLAIN, 18)); 
        t6.setBounds(550, 400, 173, 30);
        p.add(t6);

        b1 = new JButton("Back");
        b1.setBounds(100, 470, 100, 30);
        b1.setBackground(new Color(46, 204, 113)); 
        b1.setForeground(Color.WHITE); 
        b1.setFont(new Font("Arial", Font.BOLD, 16)); 
        b1.setFocusPainted(false);
        b1.addActionListener(this);
        p.add(b1);

        b2 = new JButton("Next");
        b2.setBounds(550, 470, 100, 30);
        b2.setBackground(new Color(46, 204, 113)); 
        b2.setForeground(Color.WHITE); 
        b2.setFont(new Font("Arial", Font.BOLD, 16)); 
        b2.setFocusPainted(false);
        b2.addActionListener(this);
        p.add(b2);

        this.add(p);
    }

    
    public String getFullName() {
        return t1.getText();
    }

    public String getNID() {
        return t2.getText();
    }

    public String getUserEmail() {
        return t3.getText();
    }

    public String getUserName() {
        return t4.getText();
    }

    public String getUserPassword() {
        return t5.getText();
    }

    public String getUserPasswordConfirm() {
        return t6.getText();
    }

    
    public void setFullName(String fullName) {
        t1.setText(fullName);
    }

    public void setNID(String nID) {
        t2.setText(nID);
    }

    public void setUserEmail(String userEmail) {
        t3.setText(userEmail);
    }

    public void setUserName(String userName) {
        t4.setText(userName);
    }

    public void setUserPassword(String userPassword) {
        t5.setText(userPassword);
    }

    public void setUserPasswordConfirm(String userPasswordConfirm) {
        t6.setText(userPasswordConfirm);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b2) {
            String fullName = getFullName();
            String nID = getNID();
            String userEmail = getUserEmail();
            String userName = getUserName();
            String userPassword = getUserPassword();
            String userPasswordConfirm = getUserPasswordConfirm();

            if (fullName.isEmpty() || nID.isEmpty() || userEmail.isEmpty() || userName.isEmpty() || userPassword.isEmpty() || userPasswordConfirm.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields");
            } else if (userPassword.equals(userPasswordConfirm)) {
                CreateAccount createAccount = new CreateAccount(fullName, nID, userEmail, userName, userPassword);
                createAccount.addAccount();
                JOptionPane.showMessageDialog(null, "Account Added");
                setFullName("");
                setNID("");
                setUserEmail("");
                setUserName("");
                setUserPassword("");
                setUserPasswordConfirm("");

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
