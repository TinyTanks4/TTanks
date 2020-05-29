package main;

import elements.Tank;
import elements.UserTank;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class TinyTanks 
{
	public static void main(String args[])
	{
	/*	try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
		catch (Exception ex) {
			System.out.println(ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                TinyTanks tank = new TinyTanks();
	//			tank.setVisible(true);
	//			tank.setSize(1200, 700);
            }
        });*/
		TinyTanks tanks = new TinyTanks();
	}
	
	public TinyTanks()
	{
		JFrame mainJFrame = new JFrame();
		JPanel jpanel = new JPanel();
		JLabel jlabel = new JLabel();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		mainJFrame.setSize(screenSize.width, screenSize.height);
		mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainJFrame.getContentPane().setLayout(null);
		mainJFrame.setBackground(Color.WHITE);
		mainJFrame.setLocationRelativeTo(null);
		mainJFrame.setVisible(true);
		
		
		//Create the user tank
		Tank userTank = new UserTank(mainJFrame, jpanel, jlabel);
		
	}
}
