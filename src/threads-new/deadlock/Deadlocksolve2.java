
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockSolved {

    static ReentrantLock lockA = new ReentrantLock();
    static ReentrantLock lockB = new ReentrantLock();

    static void performTask(
            ReentrantLock first,
            ReentrantLock second) {

        while (true) {
            if (first.tryLock()) {
                try {
                    System.out.println(
                        Thread.currentThread().getName()
                        + " acquired first lock"
                    );

                    if (second.tryLock()) {
                        try {
                            System.out.println(
                                Thread.currentThread().getName()
                                + " acquired second lock"
                            );

                            System.out.println("Performing task");
                            return;

                        } finally {
                            second.unlock();
                        }
                    }
                } finally {
                    first.unlock();
                }
            }

            Thread.yield();
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(
            () -> performTask(lockA, lockB),
            "Thread-1"
        );

        Thread t2 = new Thread(
            () -> performTask(lockB, lockA),
            "Thread-2"
        );

        t1.start();
        t2.start();
    }
}
