//Program to demonstrate InterThread Communication - Producer Thread Class
package com.tnsif.dayfourteen.interthreadcommunication;

public class Producer extends Thread{
	Agent obj;

	public Producer(Agent obj) {
		
		this.obj = obj;
	}
	
public void run()
{
	  int i=0;
	  while(true)
	  {
		  try
		  {
			  Thread.sleep(3000);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  obj.set(i);
		  i++;
	  }
}
}