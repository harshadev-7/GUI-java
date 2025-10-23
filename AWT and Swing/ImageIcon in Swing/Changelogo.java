import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Changelogo
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("change the logo");
        ImageIcon image = new ImageIcon("AWT and Swing\\ImageIcon in Swing\\png-transparent-dragon-ball-logo-goku.png");
        frame.setIconImage(image.getImage());
       frame.getContentPane().setBackground(Color.GREEN);
        frame.setVisible(true);
      
        
    }
}