package synchronize;
class Increment{
	int cnt;
	public  synchronized  void get_Increment() {
		cnt++;
	}
}

public class SynchronizationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Increment ic = new Increment();
		     
		     Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
				
					for(int i=0;i<1000;i++) {
						ic.get_Increment();
						 
					}
					
				}
			});
		     
		    
		     Thread t2 = new Thread(new Runnable() {
		 		
		 		@Override
		 		public void run() {
		 		
		 			for(int i=0;i<1000;i++) {
		 				ic.get_Increment();
		 				 
		 			}
		 			
		 		}
		 	});
		     
		     t1.start();
		     t2.start();
		     
		     try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     System.out.println(ic.cnt);
		    		 
	}

}
