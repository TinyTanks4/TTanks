package elements;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NormalEnemyTank extends Tank
{
	public NormalEnemyTank(JFrame f, JPanel p, JLabel l)
	{
		resizeAll("TankPics/userTank/UserTank.png", tankIcon0, tankIcon90, tankIcon180, tankIcon270);
		p = (JPanel)f.getContentPane();
        l.setIcon(tankIcon0);
        p.add(l);
        f.setVisible(true);
	}
	
	public void shoot()
	{
		
	}
	
	public void move()
	{
		
	}
}
