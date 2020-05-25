package elements;

import java.awt.Image;
import javax.swing.ImageIcon;

public abstract class Tank 
{
	ImageIcon tankIcon;
	
	public Tank()
	{
		
	}
	
	public abstract void shoot();
	
	public abstract void move();
	
	public void resize()
	{
		Image tankImage = tankIcon.getImage();
		Image smallTankImage = tankImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		tankIcon = new ImageIcon(smallTankImage);
	}
}
