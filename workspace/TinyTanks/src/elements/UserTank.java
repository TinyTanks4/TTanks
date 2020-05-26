package elements;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

public class UserTank extends Tank implements KeyListener
{
	public UserTank()
	{
		tankIcon = new ImageIcon("TankPics/userTank/UserTank.png");
		resize(tankIcon);
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
