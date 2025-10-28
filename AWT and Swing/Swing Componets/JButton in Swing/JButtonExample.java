import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonExample extends JFrame implements ActionListener
{
    JButton button;
    JButtonExample()
    {
       setTitle("Basic Jbutton example in swings");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(500,500);
       setLayout(null);
       setVisible(true);
       ImageIcon icon = new ImageIcon("C:\\Users\\harsh\\Desktop\\GUI\\GUI-java\\AWT and Swing\\Swing Componets\\JLabel in Swing\\goku.png");
       button = new JButton("Click Me");
       Image img = icon.getImage();
       Image scaledImage = img.getScaledInstance(50,50,Image.SCALE_SMOOTH);
       ImageIcon scaledIcon = new ImageIcon(scaledImage);
       button.setBounds(200, 100, 150, 90);
       button.setHorizontalTextPosition(JButton.CENTER);
       button.setVerticalTextPosition(JButton.BOTTOM);
       button.setHorizontalAlignment(JButton.CENTER);
       button.setVerticalAlignment(JButton.CENTER);
       button.addActionListener(this);
       button.setIcon(scaledIcon);
       button.setForeground(Color.CYAN);
       button.setBackground(Color.DARK_GRAY);
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
