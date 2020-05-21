

public class BoundedBuffer  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   PC pc = new PC();
		Thread t1=new Thread(new Runnable()
				{

					@Override
					public void run() {
						try
						{
							pc.produce();
						}catch(InterruptedException e)
						{
						 e.printStackTrace();
						}
						
					}
			
				});
		Thread t2=new Thread(new Runnable()
		{

			@Override
			public void run() {
				try
				{
					pc.consume();
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				
			}
	
		});
		t1.start();
		t2.start();
		/*****
		 * t1 completes before t2
		 */
		t1.join();
		t2.join();
		

	}
	

}