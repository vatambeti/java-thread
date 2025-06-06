package bankApplication;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BankAccount {
    private double balance;
    private final ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
    
    public BankAccount(double initialBalance) {
    	this.balance=initialBalance;
    }
    
    public void deposit(double amount) {
    	lock.writeLock().lock();
        try {
        	System.out.println(Thread.currentThread().getName()+"depositing $"+amount);
        	this.balance=this.balance+amount;
        }finally {
        	lock.writeLock().unlock();
        }
    }
    
    public void withdraw(double amount) {
    	lock.writeLock().lock();
        try {
        	System.out.println(Thread.currentThread().getName()+"withdrawing $"+amount);
        	this.balance=this.balance-amount;
        }finally {
        	lock.writeLock().unlock();
        }
    }
    
    public void checkBalance() {
    	lock.readLock().lock();
        try {
        	System.out.println(Thread.currentThread().getName()+"available $"+this.balance);
        	
        }finally {
        	lock.readLock().unlock();
        }
    }
    
}
