import javax.swing.JFrame; 
public class JFrameExample
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
          frame.setResizable(false);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("This is the Basic GUI program");
        frame.setResizable(false);
      
        
    }

}