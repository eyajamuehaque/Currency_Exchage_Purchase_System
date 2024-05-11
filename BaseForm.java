import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// BaseForm class is the base class for form2 and provides polymorphic behavior for username, password, and captcha

public abstract class BaseForm extends JFrame implements ActionListener {
    protected JTextField un; 
    protected JTextField pw; 
    protected JTextField captchaInput; 

    public BaseForm(String title) {
        super(title);
    }

    // Abstract method to get the user input for username
    public abstract String getUserName();

    // Abstract method to get the user input for password
    public abstract String getUserPassword();

    // Abstract method to get the user input for captcha
    public abstract String getCaptchaInput();

    // Set method to set the username
    public void setUserName(String userName) {
        un.setText(userName);
    }

    // Set method to set the password
    public void setUserPassword(String userPassword) {
        pw.setText(userPassword);
    }

    // Set method to set the captcha input
    public void setCaptchaInput(String captchaInput) {
        this.captchaInput.setText(captchaInput);
    }
}
