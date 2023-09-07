package LabQuestions;

//Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.

public class EvenOddThreadExample
{
    public static void main(String[] args) 
    {
        // Create two threads: one for even numbers and one for odd numbers
        Thread evenThread = new Thread(new EvenThread());
        Thread oddThread = new Thread(new OddThread());

        // Start the threads
        evenThread.start();
        oddThread.start();
    }
}

// Thread to print even numbers
class EvenThread implements Runnable 
{
    @Override
    public void run() 
    {
        for (int i = 2; i <= 20; i += 2)
        {
            System.out.println("Even: " + i);
            
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

// Thread to print odd numbers
class OddThread implements Runnable 
{
    @Override
    public void run() 
    {
        for (int i = 1; i <= 19; i += 2) 
        {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
