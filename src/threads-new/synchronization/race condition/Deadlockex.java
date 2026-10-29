
public class Deadlockex {

    static Object lockA = new Object();
    static Object lockB = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("Thread 1 acquired lockA");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("Thread 1 waiting for lockB");

                synchronized (lockB) {
                    System.out.println("Thread 1 acquired lockB");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("Thread 2 acquired lockB");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("Thread 2 waiting for lockA");

                synchronized (lockA) {
                    System.out.println("Thread 2 acquired lockA");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
