package picture;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ActionListenerTest implements ActionListener, KeyListener
{
    JButton button;
    JButton button2;
    JFrame frame;
    JTextArea textArea;
 
    public ActionListenerTest() {
        button = new JButton("Click Me");
        frame = new JFrame("ActionListener Test");
        textArea = new JTextArea(10, 40);
        button2 = new JButton("Click Me");
 
        button.addActionListener(this);
        button2.addActionListener(this);
        button.addKeyListener(this);
        button2.addKeyListener(this);
        textArea.setLineWrap(true);
        frame.setLayout(new BorderLayout());
        frame.add(textArea, BorderLayout.NORTH);
        frame.add(button, BorderLayout.SOUTH);
        frame.add(button2, BorderLayout.EAST);
        frame.pack();
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) 
    {
    	if (e.getSource() == button)
    	{
    		textArea.setText(textArea.getText().concat("You have clicked the button\n"));
    	}
    	else if (e.getSource() == button2)
    	{
    		textArea.setText(textArea.getText().concat("You have clicked button 2\n"));
    	}
    }
    
    public void keyPressed(KeyEvent e) {

        key(e);
    }

	@Override
	public void keyTyped(KeyEvent e) {

        key(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		button.setText("Click Me");
		button2.setText("Click Me");
	}
	
	private void key(KeyEvent e)
	{
		int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            button2.setText("Left");
        }

        if (key == KeyEvent.VK_RIGHT) {
            button2.setText("Right");
        }

        if (key == KeyEvent.VK_UP) {
        	button.setText("Up");
        }

        if (key == KeyEvent.VK_DOWN) {
        	button.setText("Down");
        }
	}
	
	public static void main(String args[]) {
        ActionListenerTest test = new ActionListenerTest();
    }
}
