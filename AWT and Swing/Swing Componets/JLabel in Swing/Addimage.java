import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Addimage
 {
    public static void main(String[] args) 
    {
        
    
        JLabel label = new JLabel();
        ImageIcon imageIcon = new ImageIcon("goku.png");
        label.setIcon(imageIcon);

        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("This is the Basic GUI program");
        frame.setResizable(false); // Remove cutomization of window resize 
        frame.setVisible(true);
        frame.add(label);
    }

    
}
