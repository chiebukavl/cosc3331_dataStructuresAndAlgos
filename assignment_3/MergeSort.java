// filename: MergeSort.java
// author: Chiebuka Lebechi
// modified: 17 OCT 2020

import java.util.Random;

public class MergeSort
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
  
        MergeSort ob = new MergeSort(); 
  
        long startTime = System.nanoTime();
        ob.sort(arr1k, 0, arr1k.length - 1); 
        ob.sort(arr1k, 0, arr1k.length - 1); 
        ob.sort(arr1k, 0, arr1k.length - 1); 
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long avg1k = elapsedTime/3;
        System.out.println("Average runtime of mergeSort on 1k array: " + avg1k + " nanoseconds.");

        startTime = System.nanoTime();
        ob.sort(arr10k, 0, arr10k.length - 1); 
        ob.sort(arr10k, 0, arr10k.length - 1); 
        ob.sort(arr10k, 0, arr10k.length - 1); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg10k = elapsedTime/3;
        System.out.println("Average runtime of mergeSort on 10k array: " + avg10k + " nanoseconds.");
        

        startTime = System.nanoTime();
        ob.sort(arr100k, 0, arr100k.length - 1); 
        ob.sort(arr100k, 0, arr100k.length - 1); 
        ob.sort(arr100k, 0, arr100k.length - 1); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg100k = elapsedTime/3;
        System.out.println("Average runtime of mergeSort on 100k array: " + avg100k + " nanoseconds.");

        startTime = System.nanoTime();
        ob.sort(arr1M, 0, arr1M.length - 1); 
        ob.sort(arr1M, 0, arr1M.length - 1); 
        ob.sort(arr1M, 0, arr1M.length - 1); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg1M = elapsedTime/3;
        System.out.println("Average runtime of mergeSort on 1M array: " + avg1M + " nanoseconds.");
    } 

    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1 + j]; 
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                arr[k] = L[i]; 
                i++; 
            } 
            else { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int l, int r) 
    { 
        if (l < r) { 
            // Find the middle point 
            int m = (l + r) / 2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr, m + 1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
}