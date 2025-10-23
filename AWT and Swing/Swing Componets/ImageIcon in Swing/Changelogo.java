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
        ImageIcon image = new ImageIcon("goku.png");
        frame.setIconImage(image.getImage());
        frame.setVisible(true);
      
        
    }
}