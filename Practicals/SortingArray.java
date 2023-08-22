package array;

import java.util.Scanner;

public class SortingArray 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        bubbleSort(arr);
        
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
    
    public static void bubbleSort(int[] arr) 
    {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++)
        {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    // Swap elements at indexes j and j+1
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped)
            {
                break;
            }
        }
    }
}
