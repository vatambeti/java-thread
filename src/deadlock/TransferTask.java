package deadlock;

public class TransferTask implements Runnable {
    private final Account from;
    private final Account to;
    private final int amount;
    private final AccountService service;

    public TransferTask(Account from, Account to, int amount, AccountService service) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.service = service;
    }

    @Override
    public void run() {
        service.transfer(from, to, amount);
    }
}

