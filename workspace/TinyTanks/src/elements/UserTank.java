package elements;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserTank extends Tank implements KeyListener
{
	JLabel l;
	
	public UserTank(JFrame f, JPanel p, JLabel l)
	{
		tankIcon = new ImageIcon("TankPics/userTank/UserTank.png");
		resize(tankIcon);
		p = (JPanel)f.getContentPane();
		l = new JLabel();
        l.setIcon(tankIcon);
        p.add(l);
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

        if (key == KeyEvent.VK_LEFT) {
            
        }

        if (key == KeyEvent.VK_RIGHT) {
            
        }

        if (key == KeyEvent.VK_UP) {
        	
        }

        if (key == KeyEvent.VK_DOWN) {
        	
        }
	}
}
