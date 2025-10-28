import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonExample extends JFrame implements ActionListener
{
    JButton button;
    JButtonExample()
    {
       setTitle("Basic Jbutton example in swings");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(250,250);
       setVisible(true);
       button = new JButton("Click Me");
       button.setBounds(0, 0, 250, 250);
       button.addActionListener(this);
       button.setForeground(Color.CYAN);
       button.setBackground(Color.BLACK);
       button.setFocusable(false);
       add(button);
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) 
    {
        // TODO Auto-generated method stub
        if(e.getSource()==button)
        {
            System.out.println("Button clicked");
        }
        else
        {
            System.out.println("Button not clicked");
        }
        
    }   
}
