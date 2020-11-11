// filename: StupidSearch.java
// author: Chiebuka Lebechi
// modified: 23 September 2020
// purpose: part C of exercise 2 in Programming assignment 2

import java.util.Random;

public class StupidSearch
{
    public static void main(String[] args)
    {
        // declare arrays of different sizes
        int[] arr500 = new int[500];
        int[] arr1k = new int[1000];
        int[] arr10k = new int[10000];
        int[] arr100k = new int[100000];

        Random r = new Random();

        // initialize arrays with sorted values
        for(int i = 0; i < arr500.length; i++)
        {
            arr500[i] = r.nextInt(100000)+1;
        }

        for(int i = 0; i < arr1k.length; i++)
        {
            arr1k[i] = r.nextInt(100000)+1;
        }

        for(int i = 0; i < arr10k.length; i++)
        {
            arr10k[i] = r.nextInt(100000)+1;
        }

        for(int i = 0; i < arr100k.length; i++)
        {
            arr100k[i] = r.nextInt(100000)+1;
        }
        
        // TEST VALUES
        int[] test = {150, 200, 50, 640, 34082, 9400, 320, 23081, -3, 92031};
       
        // TESTING VALUES WITH ARRAY OF 500 INTEGERS
        System.out.println("Executing Stupid Search algorithm..");

        long startTime = System.nanoTime();
        for(int i = 0; i < test.length; i++)
        {
            System.out.println("500 array, Trial " + (i+1) + ": ");

            long trialStart = System.nanoTime();
            int index = stupidSearch(arr500, test[i]);
            long trialEnd = System.nanoTime();

            if(index != -1)
            {
                System.out.println("    Number " + test[i] + " is at index " + index);
            }
            else 
            {
                System.out.println("    Number " + test[i] + " not found");
            }
            System.out.println("    Execution time is " + (trialEnd - trialStart) + " nanoseconds.");
            //System.out.println();
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println("[500 array] Average execution time is: " + elapsedTime/10 + " nanoseconds.");
        System.out.println();

        //////////////////////////////////////////////////////

        // TESTING VALUES WITH ARRAY OF 1000 INTEGERS
        System.out.println("Executing Stupid Search algorithm..");

        startTime = System.nanoTime();
        for(int i = 0; i < test.length; i++)
        {
            System.out.println("1000 array, Trial " + (i+1) + ": ");
            long trialStart1k = System.nanoTime();
            int index = stupidSearch(arr500, test[i]); 
            long trialEnd1k = System.nanoTime();


            if(index != -1)
            {
                System.out.println("    Number " + test[i] + " is at index " + index);
            }
            else 
            {
                System.out.println("    Number " + test[i] + " not found");
            }

            System.out.println("    Execution time is " + (trialEnd1k - trialStart1k) + " nanoseconds.");
        }

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("[1000 array] Average execution time is: " + elapsedTime/10 + " nanoseconds.");
        System.out.println();

        /////////////////////////////////////////////////

       // TESTING VALUES WITH ARRAY OF 10000 INTEGERS
       System.out.println("Executing Stupid Search algorithm..");

       startTime = System.nanoTime();
       for(int i = 0; i < test.length; i++)
       {
           System.out.println("10000 array, Trial " + (i+1) + ": ");
           long trialStart10k = System.nanoTime();
           int index = stupidSearch(arr10k, test[i]); 
           long trialEnd10k = System.nanoTime();

           if(index != -1)
           {
               System.out.println("    Number " + test[i] + " is at index " + index);
           }
           else 
           {
               System.out.println("    Number " + test[i] + " not found");
           }

           System.out.println("    Execution time is " + (trialEnd10k - trialStart10k) + " nanoseconds.");
       }

       endTime = System.nanoTime();
       elapsedTime = endTime - startTime;

       System.out.println("[10000 array] Average execution time is: " + elapsedTime/10 + " nanoseconds.");
       System.out.println();

       ////////////////////////////////////////////////////////

       // TESTING VALUES WITH ARRAY OF 100000 INTEGERS
       System.out.println("Executing Stupid Search algorithm..");

       startTime = System.nanoTime();
       for(int i = 0; i < test.length; i++)
       {
           System.out.println("100000 array, Trial " + (i+1) + ": ");
           long trialStart100k = System.nanoTime();
           int index = stupidSearch(arr100k, test[i]); 
           long trialEnd100k = System.nanoTime();

           if(index != -1)
           {
               System.out.println("    Number " + test[i] + " is at index " + index);
           }
           else 
           {
               System.out.println("    Number " + test[i] + " not found");
           }

           System.out.println("    Execution time is " + (trialEnd100k - trialStart100k) + " nanoseconds.");
       }

       endTime = System.nanoTime();
       elapsedTime = endTime - startTime;

       System.out.println("[100000 array] Average execution time is: " + elapsedTime/10 + " nanoseconds.");
       System.out.println();
    }

    public static int stupidSearch(int[] A, int key)
    {
        int n = A.length;
        
        for(int i = 0; i <= n-1; i++)
        {
            for(int j = i; j <= n-2; j++)
            {
                if(A[i] == key && A[j] == key)
                {
                    return i;
                }
            }
        }
        return -1;
    }

}