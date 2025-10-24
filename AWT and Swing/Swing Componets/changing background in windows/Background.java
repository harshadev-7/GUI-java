
import java.awt.Color;
import javax.swing.JFrame;

public class Background 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setTitle("changing Background of the window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,350);
       // frame.getContentPane().setBackground(Color.BLACK);         // set the default colors provided and it is method to set the color
       frame.getContentPane().setBackground(new Color(0,0,0)); // set the color like another method. And we can customize it
    }
    
}
