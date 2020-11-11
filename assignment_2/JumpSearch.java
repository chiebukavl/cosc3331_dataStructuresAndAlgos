// filename: JumpSearch.java
// author: Chiebuka Lebechi
// modified: 23 September 2020
// purpose: part a of Exercise 2 in Programming assignment 2

public class JumpSearch
{
    public static void main(String[] args)
    {

        // declare arrays of different sizes
        int[] arr500 = new int[500];
        int[] arr1k = new int[1000];
        int[] arr10k = new int[10000];
        int[] arr100k = new int[100000];

        // initialize arrays with sorted values
        for(int i = 0; i < arr500.length; i++)
        {
            arr500[i] = i + 1;
        }

        for(int i = 0; i < arr1k.length; i++)
        {
            arr1k[i] = i + 1;
        }

        for(int i = 0; i < arr10k.length; i++)
        {
            arr10k[i] = i + 1;
        }

        for(int i = 0; i < arr100k.length; i++)
        {
            arr100k[i] = i + 1;
        }
    
       
        // TESTING VALUES WITH ARRAY OF 500 INTEGERS
        System.out.println("Executing Jump Search algorithm..");

        long startTime = System.nanoTime();

        int trial1_500 = jumpSearch(arr500, -3);
        int trial2_500 = jumpSearch(arr500, 50);
        int trial3_500 = jumpSearch(arr500, 150);
        int trial4_500 = jumpSearch(arr500, 200);
        int trial5_500 = jumpSearch(arr500, 320);
        int trial6_500 = jumpSearch(arr500, 640);
        int trial7_500 = jumpSearch(arr500, 9400);
        int trial8_500 = jumpSearch(arr500, 23081);
        int trial9_500 = jumpSearch(arr500, 34082);
        int trial10_500 = jumpSearch(arr500, 92031);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println("[500 array] Average execution time is: " + elapsedTime/10 + " nanoseconds.");
        System.out.println();

        //////////////////////////////////////////////////////

        // TESTING VALUES WITH ARRAY OF 1000 INTEGERS
        System.out.println("Executing Jump Search algorithm..");

        startTime = System.nanoTime();
        
        long trialStart = System.nanoTime();
        int trial1_1k = jumpSearch(arr1k, -3);
        long trialEnd = System.nanoTime();

        long trial1_1k_time = trialEnd - trialStart;

        trialStart = System.nanoTime();
        int trial2_1k = jumpSearch(arr1k, 50);
        trialEnd = System.nanoTime();
        long trial2_1k_time = trialEnd - trialStart;

        trialStart = System.nanoTime();
        int trial3_1k = jumpSearch(arr1k, 150);
        trialEnd = System.nanoTime();
        long trial3_1k_time = trialEnd - trialStart;

        trialStart = System.nanoTime();
        int trial4_1k = jumpSearch(arr1k, 200);
        trialEnd = System.nanoTime();
        long trial4_1k_time = trialEnd - trialStart;

        trialStart = System.nanoTime();
        int trial5_1k = jumpSearch(arr1k, 320);
        trialEnd = System.nanoTime();
        long trial5_1k_time = trialEnd - trialStart;

        trialStart = System.nanoTime();
        int trial6_1k = jumpSearch(arr1k, 640);
        trialEnd = System.nanoTime();
        long trial6_1k_time = trialEnd - trialStart;

        trialStart = System.nanoTime();
        int trial7_1k = jumpSearch(arr1k, 9400);
        trialEnd = System.nanoTime();
        long trial7_1k_time = trialEnd - trialStart;

        trialStart = System.nanoTime();
        int trial8_1k = jumpSearch(arr1k, 23081);
        trialEnd = System.nanoTime();
        long trial8_1k_time = trialEnd - trialStart;

        trialStart = System.nanoTime();
        int trial9_1k = jumpSearch(arr1k, 34082);
        trialEnd = System.nanoTime();
        long trial9_1k_time = trialEnd - trialStart;

        trialStart = System.nanoTime();
        int trial10_1k = jumpSearch(arr1k, 92031);
        trialEnd = System.nanoTime();
        long trial10_1k_time = trialEnd - trialStart;


        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("[1000 array] Average execution time is: " + elapsedTime/10 + " nanoseconds.");
        System.out.println();

        /////////////////////////////////////////////////

    }

    // JumpSearch algorithm code from https://www.geeksforgeeks.org/jump-search/
    public static int jumpSearch(int[] arr, int x) 
    { 
        int n = arr.length; 
  
        // Finding block size to be jumped 
        int step = (int)Math.floor(Math.sqrt(n)); 
  
        // Finding the block where element is 
        // present (if it is present) 
        int prev = 0; 
        while (arr[Math.min(step, n)-1] < x) 
        { 
            prev = step; 
            step += (int)Math.floor(Math.sqrt(n)); 
            if (prev >= n) 
                return -1; 
        } 
  
        // Doing a linear search for x in block 
        // beginning with prev. 
        while (arr[prev] < x) 
        { 
            prev++; 
  
            // If we reached next block or end of 
            // array, element is not present. 
            if (prev == Math.min(step, n)) 
                return -1; 
        } 
  
        // If element is found 
        if (arr[prev] == x) 
            return prev; 
  
        return -1; 
    } 

}