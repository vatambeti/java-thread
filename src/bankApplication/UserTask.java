package bankApplication;

import java.util.concurrent.CountDownLatch;

public class UserTask extends Thread {
        private BankAccount account;
        private final CountDownLatch latch;
        
        public UserTask(BankAccount account,CountDownLatch latch,String name) {
        	super(name);
        	this.account=account;
        	this.latch=latch;
        }
        
        @Override
        public void run() {
        	try {
        		account.checkBalance();
        		account.deposit(100);
        		account.withdraw(50);
        		account.checkBalance();
        		
        	}finally {
        		latch.countDown();
        	}
        }
        
}
