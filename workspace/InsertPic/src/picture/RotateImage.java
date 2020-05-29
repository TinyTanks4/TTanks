package picture;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RotateImage 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Display Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i = new ImageIcon("C://EnemyTank1.png");
        i = rotateImageIcon(i, 0);
 
        JPanel panel = (JPanel)frame.getContentPane();
 
        JLabel label = new JLabel();
        label.setIcon(i);
        panel.add(label);
 
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
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
}
