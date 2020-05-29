package elements;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public abstract class Tank 
{
	/**
	 * Creates a ImageIcon for the pictures of the tanks
	 */
	ImageIcon tankIcon0;
	ImageIcon tankIcon90;
	ImageIcon tankIcon180;
	ImageIcon tankIcon270;
	
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
	 * Resize the Image to a 10th of the screen width
	 * @param the tank image used
	 */
	public void resize(ImageIcon a)
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int length = (int) (screenSize.width / 10);
		
		Image tankImage = a.getImage();
		Image smallTankImage = tankImage.getScaledInstance(length, length, Image.SCALE_SMOOTH);
		a = new ImageIcon(smallTankImage);
	}
	
	public static ImageIcon rotateImageIcon(ImageIcon picture, double angle) 
	{
        int w = picture.getIconWidth();
        int h = picture.getIconHeight();
        int type = BufferedImage.TYPE_INT_RGB;
        BufferedImage image = new BufferedImage(h, w, type);
        Graphics2D g2 = image.createGraphics();
        double x = (h - w)/2.0;
        double y = (w - h)/2.0;
        AffineTransform at = AffineTransform.getTranslateInstance(x, y);
        at.rotate(Math.toRadians(angle), w/2.0, h/2.0);
        g2.drawImage(picture.getImage(), at, null);
        g2.dispose();
        picture = new ImageIcon(image);
 
        return picture;
    }
	
	public void resizeAll(String image, ImageIcon icon0, ImageIcon icon90, ImageIcon icon180, ImageIcon icon270)
	{
		icon0 = new ImageIcon(image);
		resize(icon0);
		rotateImageIcon(icon0, 0);
		
		icon90 = new ImageIcon(image);
		resize(icon90);
		rotateImageIcon(icon90, 90);
		
		icon180 = new ImageIcon(image);
		resize(icon180);
		rotateImageIcon(icon180, 180);
		
		icon270 = new ImageIcon(image);
		resize(icon270);
		rotateImageIcon(icon270, 270);
	}
}
