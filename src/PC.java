import java.util.LinkedList;

public  class PC 
{
	LinkedList<Integer> l1 = new LinkedList<Integer>();
	int capacity = 2;
   
	public void produce() throws InterruptedException
{
		int value = 0;
		
	while(true)
	{
		synchronized(this)
		{
			
			while(l1.size() == capacity)
				wait();
			
				System.out.println("Producer produced"+value);
				l1.add(value++);
				notify();
				Thread.sleep(1000);
				
			
			
		}
	}
}
	public void consume() throws InterruptedException
	{
		while(true)
		{
			synchronized(this)
			{
				
				while(l1.size()==0)
				wait();
					
				int val = l1.removeFirst();
			    System.out.println("Consumer consumed"+val);
				notify();
				Thread.sleep(1000);
					
				
				
			}
		}
	}
	
}




