import javax.swing.*;

public class AddBoth 
{
    public static void main(String[] args) 
    {
        JLabel label = new JLabel();
        label.setText("you could always paint the roses red");  //add text ,image or both in a frame..
        ImageIcon imageIcon = new ImageIcon("goku.png");
        label.setIcon(imageIcon);

        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("This is the Basic GUI program");
        frame.setVisible(true);
        frame.add(label);
        
    }
    
}
