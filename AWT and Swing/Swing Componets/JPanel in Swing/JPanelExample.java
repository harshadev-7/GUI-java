import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class JPanelExample
{
    public static void main(String[] args) 
    {
        // JPanel code would go here
        ImageIcon icon = new ImageIcon("C:\\Users\\harsh\\Desktop\\GUI\\GUI-java\\AWT and Swing\\Swing Componets\\JLabel in Swing\\Vegeta.png");
        Image img = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Border border1 = BorderFactory.createLineBorder(Color.WHITE, 3);
        Border border2 = BorderFactory.createLineBorder(Color.BLACK, 3);
        icon = new ImageIcon(img);
        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setText("Goku Ultra Instinct");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setForeground(Color.WHITE);
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        panel1.setBorder(border1);
        panel.setBorder(border2);
        panel1.add(label);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("JPanel Example");
        panel.setBackground(Color.CYAN);
        panel1.setBackground(Color.BLACK);
        frame.add(panel);   
        frame.add(panel1);
        frame.setLayout(null);
        panel.setBounds(0,0,250,250);
        panel1.setBounds(250,250,250,250);
    }
    
}
