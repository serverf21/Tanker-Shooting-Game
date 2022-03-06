//Bullet Thread is like a real-world bullet in form of a button that will travel from bottom-most point to the top target in fractions of time.

import java.awt.*;
public class BulletThread extends Thread{
	public void run()
	{
		Button b=new Button();
		b.setBounds(195,350,10,10);
		Program.f.add(b);
		for(int i=350;i>=0;i=i-10)
		{
			b.setBounds(195,i,10,10);
			try {
				Thread.sleep(10); // Slowing the movement of the bullet button
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
