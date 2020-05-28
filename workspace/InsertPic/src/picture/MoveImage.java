package picture;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MoveImage extends JFrame implements ActionListener, KeyListener 
{
	Timer tm = new Timer(5, this);
	int x = 0, y = 0, velX = 0, velY = 0;

	JLabel jl = new JLabel();
	JPanel jp = new JPanel();
	
	public MoveImage()
	{
		tm.restart();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon tankIcon = new ImageIcon("C://Tank.png");
		
		Image tankImage = tankIcon.getImage();
		Image smallTankImage = tankImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		tankIcon = new ImageIcon(smallTankImage);
		
		jl.setIcon(tankIcon);
		jp.add(jl);
		add(jp);
		
		validate();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (x < 0)
		{
			velX = 0;
			x = 0;
		}
		if (x > 600)
		{
			velX = 0;
			x = 600;
		}
		if (y < 0)
		{
			velY = 0;
			y = 0;
		}
		if (y > 600)
		{
			velY = 0;
			y = 600;
		}
		
		x += velX;
		y += velY;
		repaint();
	}
	
	public void keyPressed(KeyEvent e)
	{
		int c = e.getKeyCode();
		
		if (c == KeyEvent.VK_LEFT) //left arrow
		{
			velX = -1;
			velY = 0;
		}
		if (c == KeyEvent.VK_UP) //up arrow
		{
			velX = 0;
			velY = -1;
		}
		if (c == KeyEvent.VK_RIGHT) //right arrow
		{
			velX = 1;
			velY = 0;
		}
		if (c == KeyEvent.VK_DOWN) //down arrow
		{
			velX = 0;
			velY = 1;
		}
	}
	
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) 
	{
		velX = 0;
		velY = 0;
	}
	
	public static void main(String[] args)
	{
		MoveImage i = new MoveImage();
		/*JFrame jf = new JFrame();
		JLabel jl = new JLabel();
		JPanel jp = new JPanel();
		jf.setSize(800, 600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon tankIcon = new ImageIcon("C://Tank.png");
		
		Image tankImage = tankIcon.getImage();
		Image smallTankImage = tankImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		tankIcon = new ImageIcon(smallTankImage);
		jl.setIcon(tankIcon);
		jf.add(i);*/
	}
}
