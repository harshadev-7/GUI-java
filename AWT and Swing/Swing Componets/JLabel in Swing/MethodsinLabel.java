
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MethodsinLabel 
{
    public static void main(String[] args) 
    {
        ImageIcon imageIcon = new ImageIcon("Vegeta.png");
        JLabel label = new JLabel();
        label.setText("you could always paint the roses red");
        label.setIcon(imageIcon);
        Image img = imageIcon.getImage();
        Image scaledImage = img.getScaledInstance(600,400,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        label.setIcon(scaledIcon);
        label.setForeground(Color.GREEN);
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setFont(new Font("MV Boli ",Font.ITALIC , 30));
        label.setIconTextGap(-25);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        JFrame frame = new JFrame();
        frame.setSize(650,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.add(label);
        frame.pack();
         frame.setLocationRelativeTo(null); // Center on screen
        frame.setVisible(true);


        
    }
    
}
