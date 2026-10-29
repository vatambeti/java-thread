class BankAccount{
    int balance=0;
    public synchronized void deposite(int amount){
        balance+=amount;
    }
    public synchronized void withdraw(int amount){
        balance-=amount;
    }
    public synchronized int getBalance(){
        return balance;
    }
}

public class Raceconditionsyn {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.deposite(100);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.withdraw(100);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(account.getBalance());
    }
}