// filename: InsertionSort.java
// author: Chiebuka Lebechi
// modified: 17 OCT 2020

import java.util.Random;

public class InsertionSort
{
    public static void main(String args[]) 
    { 
        int arr1k[] = new int[1000];
        int arr10k[] = new int[10000];
        int arr100k[] = new int[100000];
        int arr1M[] = new int[1000000];

        Random r = new Random();

        for(int i = 0; i < arr1k.length; i++)
        {
            arr1k[i] = r.nextInt(1000)+1;
        }

        for(int i = 0; i < arr10k.length; i++)
        {
            arr10k[i] = r.nextInt(10000)+1;
        }

        for(int i = 0; i < arr100k.length; i++)
        {
            arr100k[i] = r.nextInt(100000)+1;
        }

        for(int i = 0; i < arr1M.length; i++)
        {
            arr1M[i] = r.nextInt(1000000)+1;
        }
        
        InsertionSort ob = new InsertionSort(); 

        long startTime = System.nanoTime();
        ob.sort(arr1k);
        ob.sort(arr1k);
        ob.sort(arr1k);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long avg1k = elapsedTime/3;
        System.out.println("Average runtime of insertionSort on 1k array: " + avg1k + " nanoseconds.");

        startTime = System.nanoTime();
        ob.sort(arr10k);
        ob.sort(arr10k);
        ob.sort(arr10k);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg10k = elapsedTime/3;
        System.out.println("Average runtime of insertionSort on 10k array: " + avg10k + " nanoseconds.");
        

        startTime = System.nanoTime();
        ob.sort(arr100k);
        ob.sort(arr100k);
        ob.sort(arr100k);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg100k = elapsedTime/3;
        System.out.println("Average runtime of insertionSort on 100k array: " + avg100k + " nanoseconds.");

        startTime = System.nanoTime();
        ob.sort(arr1M);
        ob.sort(arr1M);
        ob.sort(arr1M);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg1M = elapsedTime/3;
        System.out.println("Average runtime of insertionSort on 1M array: " + avg1M + " nanoseconds.");
    } 

    /*Function to sort array using insertion sort*/
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
  
    /* A utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
}