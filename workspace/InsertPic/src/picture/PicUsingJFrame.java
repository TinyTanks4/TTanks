package picture;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PicUsingJFrame 
{
	public PicUsingJFrame()
	{
		JFrame frame = new JFrame("Display Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel panel = (JPanel)frame.getContentPane();
 
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("C://EnemyTank1.png"));// your image here
        panel.add(label);
 
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main (String args[]) 
    {
    	PicUsingJFrame f = new PicUsingJFrame();
	}
}
