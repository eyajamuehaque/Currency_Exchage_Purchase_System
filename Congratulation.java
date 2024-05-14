import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Congratulation extends BaseFrame {
    JLabel label;

    public Congratulation(String username, String purchaseAmount, String companyName, String paymentMethod) {
        super("Congratulations!");

        this.getContentPane().setBackground(new Color(123, 104, 138)); 

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(123, 104, 238));

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
        String currentTime = sdf.format(new Date());

        label = new JLabel("<html><div style='text-align: center;'><h1 style='color: #fff;'>Congratulations!</h1>"
                + "<br><div style='font-size: 18px; color: #fff;'>"
                + "Your purchase amount is " + purchaseAmount + "<br>"
                + "Payment Company: " + companyName + "<br>"
                + "Payment Method: " + paymentMethod + "<br>"
                + "<strong>Time of Purchase:</strong> " + currentTime + "</div></div></html>");
        label.setForeground(Color.WHITE); 
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        panel.add(label, BorderLayout.CENTER);

        JButton feedbackButton = new JButton("Leave Feedback");
        feedbackButton.addActionListener(e -> new Feedback());
        panel.add(feedbackButton, BorderLayout.SOUTH);

        this.add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Congratulation("JohnDoe", "$150.00", "Visa", "Credit Card").setVisible(true);
        });
    }
}
