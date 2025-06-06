package bankApplication;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount sharedAccount = new BankAccount(500);
        int numberOfUsers = 3;
        CountDownLatch latch = new CountDownLatch(numberOfUsers);

        for (int i = 1; i <= numberOfUsers; i++) {
            new UserTask(sharedAccount, latch, "User-" + i).start();
        }

        latch.await(); // Wait for all user threads to finish
        System.out.println("All transactions completed.");
    }
}
