import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Congratulation extends JFrame {
    JLabel label;

    public Congratulation(String username, String purchaseAmount, String companyName, String paymentMethod) {
        super("Congratulations!");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(123, 104, 238)); 

        
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(123, 104, 238));

        
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
        String currentTime = sdf.format(new Date());

       
        label = new JLabel("<html><div style='text-align: center;'><h1 style='color: #fff;'>Congratulations!</h1>"
                + "<br><div style='font-size: 18px; color: #fff;'>"
                + "Your purchase amount is " + purchaseAmount + "<br>"
                + "Account holder: " + username + "<br>"
                + "Payment Company: " + companyName + "<br>"
                + "Payment Method: " + paymentMethod + "<br>"
                + "<strong>Time of Purchase:</strong> " + currentTime + "</div></div></html>");
        label.setForeground(Color.WHITE); 

        // Add the label to the panel
        panel.add(label);

        // Add the panel to the frame's content pane
        this.add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Test the Congratulation window
        java.awt.EventQueue.invokeLater(() -> new Congratulation("John Doe", "$100", "Company X", "Credit Card").setVisible(true));
    }
}
