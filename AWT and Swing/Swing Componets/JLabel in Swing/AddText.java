import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddText 
{
    public static void main (String[] args)
    {
        JLabel label = new JLabel();
        label.setText("you could always paint the roses red");  //add text ,image or both in a frame..
        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("This is the Basic GUI program");
        frame.setResizable(false); // Remove cutomization of window resize 
        frame.setVisible(true);
        frame.add(label);

      
    }
    
}
