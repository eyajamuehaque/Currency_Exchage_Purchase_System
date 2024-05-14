import javax.swing.JFrame;

public class BaseFrame extends JFrame {
    public BaseFrame(String title) {
        super(title);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//this codeshows the bras
