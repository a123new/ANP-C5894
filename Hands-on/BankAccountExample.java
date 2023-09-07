package LabQuestions;

/*Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountExample
{
    public static void main(String[] args) 
    {
        // Create a bank account with an initial balance of $1000
        BankAccount account = new BankAccount(1000);

        // Create two threads for concurrent deposits and withdrawals
        Thread depositThread = new Thread(new DepositTask(account));
        Thread withdrawThread = new Thread(new WithdrawTask(account));

        // Start the threads
        depositThread.start();
        withdrawThread.start();
    }
}

// BankAccount class representing the account balance
class BankAccount 
{
    private double balance;
    private final Lock lock = new ReentrantLock();

    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount)
    {
        lock.lock(); // Acquire the lock to ensure thread safety
        
        try {
            balance += amount;
            System.out.println("Deposited: " + amount);
            
            System.out.println("Balance: " + balance);
            
        } 
        finally 
        {
        	
            lock.unlock(); // Release the lock
        }
    }

    // Withdraw method
    public void withdraw(double amount) 
    {
        lock.lock(); // Acquire the lock to ensure thread safety
        try 
        {
            if (balance >= amount)
            {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
                System.out.println("Balance: " + balance);
                
            } 
            else
            {
                System.out.println("Insufficient balance for withdrawal.");
            }
            
        } 
        finally
        {
            lock.unlock(); // Release the lock
        }
    }
}

// DepositTask class representing a task to deposit money into the account
class DepositTask implements Runnable 
{
    private BankAccount account;

    public DepositTask(BankAccount account)
    {
        this.account = account;
    }

    @Override
    public void run() 
    {
        for (int i = 0; i < 5; i++)
        {
            double amount = Math.random() * 100; // Deposit a random amount
            account.deposit(amount);
            try {
                Thread.sleep(100); // Sleep for a short time
            } catch (InterruptedException e) {
                e.printStackTrace();
                
            }
        }
    }
}

// WithdrawTask class representing a task to withdraw money from the account
class WithdrawTask implements Runnable 
{
    private BankAccount account;

    public WithdrawTask(BankAccount account)
    {
        this.account = account;
    }

    @Override
    public void run() 
    {
        for (int i = 0; i < 5; i++) 
        {
            double amount = Math.random() * 100; // Withdraw a random amount
            account.withdraw(amount);
            
            try {
            	
                Thread.sleep(100); // Sleep for a short time
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
