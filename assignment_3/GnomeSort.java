// filename: GnomeSort.java
// author: Chiebuka Lebechi
// modified: 17 OCT 2020

import java.util.Random;

public class GnomeSort { 
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
        }
        

        long startTime = System.nanoTime();
        gnomeSort(arr1k, arr1k.length);
        gnomeSort(arr1k, arr1k.length);
        gnomeSort(arr1k, arr1k.length);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long avg1k = elapsedTime/3;
        System.out.println("Average runtime of gnomeSort on 1k array: " + avg1k + " nanoseconds.");

        startTime = System.nanoTime();
        gnomeSort(arr10k, arr10k.length);
        gnomeSort(arr10k, arr10k.length);
        gnomeSort(arr10k, arr10k.length);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg10k = elapsedTime/3;
        System.out.println("Average runtime of gnomeSort on 10k array: " + avg10k + " nanoseconds.");
        

        startTime = System.nanoTime();
        gnomeSort(arr100k, arr100k.length);
        gnomeSort(arr100k, arr100k.length);
        gnomeSort(arr100k, arr100k.length);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg100k = elapsedTime/3;
        System.out.println("Average runtime of gnomeSort on 100k array: " + avg100k + " nanoseconds.");

        startTime = System.nanoTime();
        gnomeSort(arr1M, arr1M.length);
        gnomeSort(arr1M, arr1M.length);
        gnomeSort(arr1M, arr1M.length);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg1M = elapsedTime/3;
        System.out.println("Average runtime of gnomeSort on 1M array: " + avg1M + " nanoseconds.");
  
        // System.out.print("Sorted sequence after applying Gnome sort: "); 
        // System.out.println(Arrays.toString(arr)); 
    } 

    static void gnomeSort(int arr[], int n) 
    { 
        int index = 0; 
  
        while (index < n) { 
            if (index == 0) 
                index++; 
            if (arr[index] >= arr[index - 1]) 
                index++; 
            else { 
                int temp = 0; 
                temp = arr[index]; 
                arr[index] = arr[index - 1]; 
                arr[index - 1] = temp; 
                index--; 
            } 
        } 
        return; 
    } 
} 