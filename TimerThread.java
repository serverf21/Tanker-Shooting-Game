// Timer Thread would be like a countdown where the timer would go from 60 to 0; second by second. 

public class TimerThread extends Thread {
public void run()
{
	for(int i=60;i>=0;i--)
	{
		Program.timer.setText(""+i); //Coundown going from 60 to 0
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
}
  
