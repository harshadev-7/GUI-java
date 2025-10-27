import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicJPanelEXample 
{
    public static void main(String[] args) 
    {
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        JPanel blackpanel = new JPanel();
        blackpanel.setBackground(Color.BLACK);
        redpanel.setBounds(0,0,100,100);
        blackpanel.setBounds(100,100,100,100);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.add(redpanel);
        frame.add(blackpanel);
        frame.setLayout(null);
        frame.setVisible(true);

        
    }
    
}
