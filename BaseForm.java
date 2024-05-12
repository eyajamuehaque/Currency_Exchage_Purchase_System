import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public abstract class BaseForm extends JFrame implements ActionListener {
    protected JTextField un; 
    protected JTextField pw; 
    protected JTextField captchaInput; 

    public BaseForm(String title) {
        super(title);
    }

   
    public abstract String getUserName();

    
    public abstract String getUserPassword();

    
    public abstract String getCaptchaInput();

    
    public void setUserName(String userName) {
        un.setText(userName);
    }

    
    public void setUserPassword(String userPassword) {
        pw.setText(userPassword);
    }

    
    public void setCaptchaInput(String captchaInput) {
        this.captchaInput.setText(captchaInput);
    }
}
