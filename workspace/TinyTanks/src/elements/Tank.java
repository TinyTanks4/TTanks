package elements;

import java.awt.Image;
import javax.swing.ImageIcon;

public abstract class Tank 
{
	/**
	 * Creates a ImageIcon for the pictures of the tanks
	 */
	ImageIcon tankIcon;
	
	/**
	 * Creates a tank
	 */
	public Tank()
	{
		
	}
	
	/**
	 * The shooting method of the tank
	 */
	public abstract void shoot();
	
	/**
	 * The movement of the tank
	 */
	public abstract void move();
	
	/**
	 * Resize the Image to 150 x 150
	 * @param the tank image used
	 */
	public void resize(ImageIcon a)
	{
		Image tankImage = a.getImage();
		Image smallTankImage = tankImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		a = new ImageIcon(smallTankImage);
	}
}
