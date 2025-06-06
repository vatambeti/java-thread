package deadlock.prevention;

import java.util.concurrent.locks.ReentrantLock;

import deadlock.Account;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1, 1000);
        Account acc2 = new Account(2, 1000);

        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();

        SafeAccountService service = new SafeAccountService();

        Runnable task1 = () -> service.transfer(acc1, acc2, 100, lock1, lock2);
        Runnable task2 = () -> service.transfer(acc2, acc1, 200, lock2, lock1); // locks passed in reverse intentionally

        Thread t1 = new Thread(task1, "Thread-A");
        Thread t2 = new Thread(task2, "Thread-B");

        t1.start();
        t2.start();
    }
}

