
class priorities extends Thread {

    priorities(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                "Thread is running: " +
                Thread.currentThread().getName() + " : " + i
            );

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

public class Priority {
    public static void main(String[] args) {

        priorities t1 = new priorities("t1");
        priorities t2 = new priorities("t2");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getName() + " priority: " + t1.getPriority());
        System.out.println(t2.getName() + " priority: " + t2.getPriority());

        t1.start();
        t2.start();
    }
}
