// filename: PancakeSort.java
// author: Chiebuka Lebechi
// modified: 17 OCT 2020

import java.util.Random;

public class PancakeSort
{
    public static void main (String[] args) 
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
          
        pancakeSort(arr1k, arr1k.length); 

        long startTime = System.nanoTime();
        pancakeSort(arr1k, arr1k.length); 
        pancakeSort(arr1k, arr1k.length); 
        pancakeSort(arr1k, arr1k.length); 
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long avg1k = elapsedTime/3;
        System.out.println("Average runtime of pancakeSort on 1k array: " + avg1k + " nanoseconds.");

        startTime = System.nanoTime();
        pancakeSort(arr10k, arr10k.length); 
        pancakeSort(arr10k, arr10k.length); 
        pancakeSort(arr10k, arr10k.length); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg10k = elapsedTime/3;
        System.out.println("Average runtime of pancakeSort on 10k array: " + avg10k + " nanoseconds.");
        

        startTime = System.nanoTime();
        pancakeSort(arr100k, arr100k.length); 
        pancakeSort(arr100k, arr100k.length); 
        pancakeSort(arr100k, arr100k.length); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg100k = elapsedTime/3;
        System.out.println("Average runtime of pancakeSort on 100k array: " + avg100k + " nanoseconds.");

        startTime = System.nanoTime();
        pancakeSort(arr1M, arr1M.length); 
        pancakeSort(arr1M, arr1M.length); 
        pancakeSort(arr1M, arr1M.length); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg1M = elapsedTime/3;
        System.out.println("Average runtime of pancakeSort on 1M array: " + avg1M + " nanoseconds.");
          
    } 

    /* Reverses arr[0..i] */
    static void flip(int arr[], int i) 
    { 
        int temp, start = 0; 
        while (start < i) 
        { 
            temp = arr[start]; 
            arr[start] = arr[i]; 
            arr[i] = temp; 
            start++; 
            i--; 
        } 
    } 
  
    // Returns index of the  
    // maximum element in  
    // arr[0..n-1]  
    static int findMax(int arr[], int n) 
    { 
        int mi, i; 
        for (mi = 0, i = 0; i < n; ++i) 
            if (arr[i] > arr[mi]) 
                mi = i; 
        return mi; 
    }
    
    // The main function that 
    // sorts given array using  
    // flip operations 
    static int pancakeSort(int arr[], int n) 
    { 
        // Start from the complete 
        // array and one by one 
        // reduce current size by one 
        for (int curr_size = n; curr_size > 1; --curr_size) 
        { 
            // Find index of the 
            // maximum element in 
            // arr[0..curr_size-1] 
            int mi = findMax(arr, curr_size); 
  
            // Move the maximum element 
            // to end of current array 
            // if it's not already at  
            // the end 
            if (mi != curr_size-1) 
            { 
                // To move at the end, 
                // first move maximum 
                // number to beginning 
                flip(arr, mi); 
  
                // Now move the maximum  
                // number to end by 
                // reversing current array 
                flip(arr, curr_size-1); 
            } 
        } 
        return 0; 
    } 
}