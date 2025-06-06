package deadlock.prevention;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import deadlock.Account;

public class SafeAccountService {

    public void transfer(Account from, Account to, int amount,
                         ReentrantLock lock1, ReentrantLock lock2) {

        boolean fromLockAcquired = false;
        boolean toLockAcquired = false;

        try {
            fromLockAcquired = lock1.tryLock(1, TimeUnit.SECONDS);
            toLockAcquired = lock2.tryLock(1, TimeUnit.SECONDS);

            if (fromLockAcquired && toLockAcquired) {
                // Critical section
                from.withdraw(amount);
                to.deposit(amount);
                System.out.println(Thread.currentThread().getName() + " safely transferred $" + amount);
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire locks. Aborting transfer.");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (toLockAcquired) lock2.unlock();
            if (fromLockAcquired) lock1.unlock();
        }
    }
}

