// filename: RadixSort.java
// author: Chiebuka Lebechi
// modified: 17 OCT 2020

import java.util.Random;
import java.io.*;
import java.util.*;

public class RadixSort
{
    public static void main(String[] args)
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
        };
           
        long startTime = System.nanoTime();
        radixsort(arr1k, arr1k.length);
        radixsort(arr1k, arr1k.length);
        radixsort(arr1k, arr1k.length);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long avg1k = elapsedTime/3;
        System.out.println("Average runtime of heapSort on 1k array: " + avg1k + " nanoseconds.");

        startTime = System.nanoTime();
        radixsort(arr10k, arr10k.length);
        radixsort(arr10k, arr10k.length);
        radixsort(arr10k, arr10k.length);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg10k = elapsedTime/3;
        System.out.println("Average runtime of heapSort on 10k array: " + avg10k + " nanoseconds.");
        

        startTime = System.nanoTime();
        radixsort(arr100k, arr100k.length);
        radixsort(arr100k, arr100k.length);
        radixsort(arr100k, arr100k.length);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg100k = elapsedTime/3;
        System.out.println("Average runtime of heapSort on 100k array: " + avg100k + " nanoseconds.");

        startTime = System.nanoTime();
        radixsort(arr1M, arr1M.length);
        radixsort(arr1M, arr1M.length);
        radixsort(arr1M, arr1M.length);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg1M = elapsedTime/3;
        System.out.println("Average runtime of heapSort on 1M array: " + avg1M + " nanoseconds.");
    } 
 
    // A utility function to get maximum value in arr[]
    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
 
    // The main function to that sorts arr[] of size n using
    // Radix Sort
    static void radixsort(int arr[], int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);
 
        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
 
    // A utility function to print an array
    static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}