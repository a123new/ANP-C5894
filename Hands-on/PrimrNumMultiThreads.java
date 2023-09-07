package LabQuestions;

/* Write a Java program that calculates the sum of
 *  all prime numbers up to a given limit using multiple threads.*/

import java.util.concurrent.*;

public class PrimrNumMultiThreads
{
        public static void main(String[] args)
        {
        int limit = 100; // Define the upper limit
        int numThreads = 4; // Number of threads to use

        // Create a thread pool with the specified number of threads
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        // Split the range of numbers evenly among the threads
        int rangePerThread = limit / numThreads;

        // Array to store results from each thread
        Future<Long>[] results = new Future[numThreads];

        int start = 1;
        int end = rangePerThread;

        // Create and submit tasks to check for prime numbers and sum them
        for (int i = 0; i < numThreads; i++)
        {
            results[i] = executor.submit(new PrimeSumTask(start, end));
            start = end + 1;
            end += rangePerThread;
        }

        // Wait for all threads to finish and sum their results
        long totalSum = 0;
        for (int i = 0; i < numThreads; i++) 
        {
            try {
                totalSum += results[i].get();
                
            } 
            catch (InterruptedException | ExecutionException e)
            {
                e.printStackTrace();
            }
        }

        // Shutdown the thread pool
        executor.shutdown();

        // Print the total sum of prime numbers
        System.out.println("Sum of prime numbers up to " + limit + ": " + totalSum);
    }
}

// Task to check for prime numbers and calculate their sum in a range
class PrimeSumTask implements Callable<Long>
{
    private int start;
    private int end;

    public PrimeSumTask(int start, int end)
    {
        this.start = start;
        
        this.end = end;
    }

    @Override
    public Long call() 
    {
        long sum = 0;
        for (int num = start; num <= end; num++)
        {
            if (isPrime(num))
            {
                sum += num;
            }
        }
        return sum;
    }

    // Helper function to check if a number is prime
    private boolean isPrime(int n)
    {
        if (n <= 1) 
        {
            return false;
        }
        if (n <= 3)
        {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) 
        {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) 
        {
            if (n % i == 0 || n % (i + 2) == 0)
            {
                return false;
            }
        }
        return true;
    }
}
