package deadlock;

public class Account {
	
	public final int id;
	public int balance;
	
	public Account(int id,int balance) {
		this.id=id;
		this.balance=balance;
	}
	
	public int getId() {
		return id;
	}
	
	public void deposit(int amount) {
		this.balance+=amount;
		
	}
	
	public void withdraw(int amount) {
		this.balance-=amount;
		
	}
	
	public int getBalance() {
		return balance;
	}
	

}
