// filename: CycleSort.java
// author: Chiebuka Lebechi
// modified: 17 OCT 2020

import java.util.Random;
  
class CycleSort { 
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
        cycleSort(arr1k, arr1k.length);
        cycleSort(arr1k, arr1k.length);
        cycleSort(arr1k, arr1k.length);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long avg1k = elapsedTime/3;
        System.out.println("Average runtime of cyleSort on 1k array: " + avg1k + " nanoseconds.");

        startTime = System.nanoTime();
        cycleSort(arr10k, arr10k.length);
        cycleSort(arr10k, arr10k.length);
        cycleSort(arr10k, arr10k.length);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg10k = elapsedTime/3;
        System.out.println("Average runtime of cyleSort on 10k array: " + avg10k + " nanoseconds.");
        

        startTime = System.nanoTime();
        cycleSort(arr100k, arr100k.length);
        cycleSort(arr100k, arr100k.length);
        cycleSort(arr100k, arr100k.length);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg100k = elapsedTime/3;
        System.out.println("Average runtime of cyleSort on 100k array: " + avg100k + " nanoseconds.");

        startTime = System.nanoTime();
        cycleSort(arr1M, arr1M.length);
        cycleSort(arr1M, arr1M.length);
        cycleSort(arr1M, arr1M.length);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg1M = elapsedTime/3;
        System.out.println("Average runtime of cyleSort on 1M array: " + avg1M + " nanoseconds.");
    } 

    // Function sort the array using Cycle sort 
    public static void cycleSort(int arr[], int n) 
    { 
        // count number of memory writes 
        int writes = 0; 
  
        // traverse array elements and put it to on 
        // the right place 
        for (int cycle_start = 0; cycle_start <= n - 2; cycle_start++) { 
            // initialize item as starting point 
            int item = arr[cycle_start]; 
  
            // Find position where we put the item. We basically 
            // count all smaller elements on right side of item. 
            int pos = cycle_start; 
            for (int i = cycle_start + 1; i < n; i++) 
                if (arr[i] < item) 
                    pos++; 
  
            // If item is already in correct position 
            if (pos == cycle_start) 
                continue; 
  
            // ignore all duplicate elements 
            while (item == arr[pos]) 
                pos += 1; 
  
            // put the item to it's right position 
            if (pos != cycle_start) { 
                int temp = item; 
                item = arr[pos]; 
                arr[pos] = temp; 
                writes++; 
            } 
  
            // Rotate rest of the cycle 
            while (pos != cycle_start) { 
                pos = cycle_start; 
  
                // Find position where we put the element 
                for (int i = cycle_start + 1; i < n; i++) 
                    if (arr[i] < item) 
                        pos += 1; 
  
                // ignore all duplicate elements 
                while (item == arr[pos]) 
                    pos += 1; 
  
                // put the item to it's right position 
                if (item != arr[pos]) { 
                    int temp = item; 
                    item = arr[pos]; 
                    arr[pos] = temp; 
                    writes++; 
                } 
            } 
        } 
    }  
} 