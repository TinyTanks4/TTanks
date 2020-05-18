package picture;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PicUsingJOptionPane 
{
	public static void main(String[] args)
	{
		ImageIcon tankIcon = new ImageIcon("C://Tank.png");
	
		Image tankImage = tankIcon.getImage();
		Image smallTankImage = tankImage.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
		tankIcon = new ImageIcon(smallTankImage);
		
		JOptionPane.showMessageDialog(null, null, "Tank", JOptionPane.INFORMATION_MESSAGE, tankIcon);
	}
}
