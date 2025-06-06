package deadlock;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1, 1000);
        Account acc2 = new Account(2, 1000);

        AccountService service = new AccountService();

        Thread t1 = new Thread(new TransferTask(acc1, acc2, 100, service), "Thread-A");
        Thread t2 = new Thread(new TransferTask(acc2, acc1, 200, service), "Thread-B");

        t1.start();
        t2.start();
    }
}

