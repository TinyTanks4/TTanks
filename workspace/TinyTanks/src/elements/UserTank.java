package elements;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserTank extends Tank implements KeyListener
{
	JLabel l;
	
	public UserTank(JFrame f, JPanel p, JLabel l)
	{
		this.l = l;
		resizeAll("TankPics/userTank/UserTank.png", tankIcon0, tankIcon90, tankIcon180, tankIcon270);
		p = (JPanel)f.getContentPane();
        this.l.setIcon(tankIcon0);
        p.add(this.l);
        f.setVisible(true);
	}
	
	public void shoot()
	{
		
	}
	
	public void keyPressed(KeyEvent e) {

	       TankMove(e);
	   }

	@Override
	public void keyTyped(KeyEvent e) {

	       TankMove(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//Stop moving
	}
		
	private void TankMove(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		//I don't know if this will work because it isn't the direct
		//label from the main class
        if (key == KeyEvent.VK_LEFT) 
        {
            l.removeAll();
            l.setIcon(tankIcon270);
        }

        if (key == KeyEvent.VK_RIGHT) 
        {
        	l.removeAll();
        	l.setIcon(tankIcon90);
        }

        if (key == KeyEvent.VK_UP) 
        {
        	l.removeAll();
        	l.setIcon(tankIcon0);
        }

        if (key == KeyEvent.VK_DOWN) 
        {
        	l.removeAll();
        	l.setIcon(tankIcon180);
        }
	}
}
