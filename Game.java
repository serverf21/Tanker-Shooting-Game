//Importing the libraries for UI (AWT) and action listener

import java.awt.*;
import java.awt.event.*;

public class Program {
static Frame f;
static Button target,tank;
static Label timer; //To enable a countdown on the screen
Program()
{
	f=new Frame();
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e)
		{
			f.dispose(); // Setting up the Window Listener and action to be performed on pressing 'X' button
		}
	});
	target=new Button();
	tank=new Button();
	tank.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			BulletThread bt=new BulletThread(); //Thread definition for bullet thread
			bt.start(); // Thread initiation for bullet button
		}
	});
	timer=new Label("60"); // This will be made dynamic by using multithreading
	f.setLayout(null);
	target.setBounds(10,30,100,20); // Setting the layout for target button, shooting tank and the timer. 
	tank.setBounds(180,360,40,40);
	
	timer.setBounds(10,360,40,40);
	f.add(target);
	f.add(tank);
	
	f.add(timer);
	f.setVisible(true);
	f.setSize(400,400);
	TimerThread t1=new TimerThread(); //Thread definition for timer thread
	t1.start(); //Thread initiation for timer thread
	TargetThread t2=new TargetThread(); // Thread definition for target (button) thread 
	t2.start(); // Thread initiation for target (button) thread
	
}
public static void main(String ar[])
{
	Program p=new Program();
}
}



