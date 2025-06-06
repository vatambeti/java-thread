package deadlock;

public class AccountService {
   public void transfer(Account from,Account to,int amount) {
	   synchronized (from) {
		   System.out.println(Thread.currentThread().getName()+"this is getting"+from.getId());
		  try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		synchronized (to) {
			 System.out.println(Thread.currentThread().getName() + " locked Account " + to.getId());

             from.withdraw(amount);
             to.deposit(amount);
             System.out.println(Thread.currentThread().getName() + " transferred $" + amount);
			
		}
		
	}
   }
}
