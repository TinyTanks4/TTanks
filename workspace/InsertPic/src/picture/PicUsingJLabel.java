package picture;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PicUsingJLabel extends JFrame 
{
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	
	public PicUsingJLabel()
	{
		setTitle("Tank");
		setVisible(true);
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		jl.setIcon(new ImageIcon("C://tank.png"));
		jp.add(jl);
		
		add(jp);
		validate();
	}
	
	public static void main(String[] args)
	{
		PicUsingJLabel tank = new PicUsingJLabel();
	}
}
