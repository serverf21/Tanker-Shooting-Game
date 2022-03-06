// The target will also be mobile in nature and hence would be moving. This part would make the game more challenging.

public class TargetThread extends Thread {

	public void run() // Defining the run function
	{
		while(true)
		{
			int x=Program.target.getX();
			if(x>=400)
				x=0;
			Program.target.setBounds(x+10,30,100,20);
			
			
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
