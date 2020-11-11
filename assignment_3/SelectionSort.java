// filename: SelectionSort.java
// author: Chiebuka Lebechi
// modified: 17 OCT 2020

import java.util.Random;
import java.util.*; 

class SelectionSort 
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

        SelectionSort ob = new SelectionSort(); 

        long startTime = System.nanoTime();
        ob.sort(arr1k); 
        ob.sort(arr1k); 
        ob.sort(arr1k); 
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long avg1k = elapsedTime/3;
        System.out.println("Average runtime of selectionSort on 1k array: " + avg1k + " nanoseconds.");

        startTime = System.nanoTime();
        ob.sort(arr10k); 
        ob.sort(arr10k); 
        ob.sort(arr10k); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg10k = elapsedTime/3;
        System.out.println("Average runtime of selectionSort on 10k array: " + avg10k + " nanoseconds.");
        

        startTime = System.nanoTime();
        ob.sort(arr100k); 
        ob.sort(arr100k); 
        ob.sort(arr100k); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg100k = elapsedTime/3;
        System.out.println("Average runtime of selectionSort on 100k array: " + avg100k + " nanoseconds.");

        startTime = System.nanoTime();
        ob.sort(arr1M); 
        ob.sort(arr1M); 
        ob.sort(arr1M); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg1M = elapsedTime/3;
        System.out.println("Average runtime of selectionSort on 1M array: " + avg1M + " nanoseconds.");
    } 

    void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
} 