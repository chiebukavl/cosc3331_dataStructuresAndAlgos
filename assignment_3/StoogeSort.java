// filename: StoogeSort.java
// author: Chiebuka Lebechi
// modified: 17 OCT 2020

import java.util.Random;
import java.io.*; 
  
public class StoogeSort
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
    
        long startTime = System.nanoTime();
        stoogesort(arr1k, 0, arr1k.length - 1); 
        stoogesort(arr1k, 0, arr1k.length - 1); 
        stoogesort(arr1k, 0, arr1k.length - 1); 
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long avg1k = elapsedTime/3;
        System.out.println("Average runtime of stoogeSort on 1k array: " + avg1k + " nanoseconds.");

        startTime = System.nanoTime();
        stoogesort(arr10k, 0, arr10k.length - 1); 
        stoogesort(arr10k, 0, arr10k.length - 1); 
        stoogesort(arr10k, 0, arr10k.length - 1); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg10k = elapsedTime/3;
        System.out.println("Average runtime of stoogeSort on 10k array: " + avg10k + " nanoseconds.");
        

        startTime = System.nanoTime();
        stoogesort(arr100k, 0, arr100k.length - 1); 
        stoogesort(arr100k, 0, arr100k.length - 1); 
        stoogesort(arr100k, 0, arr100k.length - 1); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg100k = elapsedTime/3;
        System.out.println("Average runtime of stoogeSort on 100k array: " + avg100k + " nanoseconds.");

        startTime = System.nanoTime();
        stoogesort(arr1M, 0, arr1M.length - 1); 
        stoogesort(arr1M, 0, arr1M.length - 1); 
        stoogesort(arr1M, 0, arr1M.length - 1); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg1M = elapsedTime/3;
        System.out.println("Average runtime of stoogeSort on 1M array: " + avg1M + " nanoseconds.");
    } 

    // Function to implement stooge sort 
    static void stoogesort(int arr[], int l, int h) 
    { 
        if (l >= h) 
            return; 
  
        // If first element is smaller 
        // than last, swap them 
        if (arr[l] > arr[h]) { 
            int t = arr[l]; 
            arr[l] = arr[h]; 
            arr[h] = t; 
        } 
  
        // If there are more than 2 elements in 
        // the array 
        if (h - l + 1 > 2) { 
            int t = (h - l + 1) / 3; 
  
            // Recursively sort first 2/3 elements 
            stoogesort(arr, l, h - t); 
  
            // Recursively sort last 2/3 elements 
            stoogesort(arr, l + t, h); 
  
            // Recursively sort first 2/3 elements 
            // again to confirm 
            stoogesort(arr, l, h - t); 
        } 
    }
} 