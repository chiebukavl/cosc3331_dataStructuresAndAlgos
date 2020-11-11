// filename: BinarySearch.java
// author: Chiebuka Lebechi
// modified: 27 September 2020
// purpose: part b of Exercise 2 in Programming assignment 2

public class BinarySearch
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
        
        // TEST VALUES
        int[] test = {150, 200, 50, 640, 34082, 9400, 320, 23081, -3, 92031};

        // TESTING VALUES WITH ARRAY OF 500 INTEGERS
        System.out.println("Executing Binary Search algorithm..");

        long startTime = System.nanoTime();
        for(int i = 0; i < test.length; i++)
        {
            System.out.println("500 array, Trial " + (i+1) + ": ");

            long trialStart = System.nanoTime();
            int index = binarySearch(arr500, test[i]);
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
        System.out.println("Executing Binary Search algorithm..");

        startTime = System.nanoTime();
        for(int i = 0; i < test.length; i++)
        {
            System.out.println("1000 array, Trial " + (i+1) + ": ");
            long trialStart1k = System.nanoTime();
            int index = binarySearch(arr500, test[i]); 
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
       System.out.println("Executing Binary Search algorithm..");

       startTime = System.nanoTime();
       for(int i = 0; i < test.length; i++)
       {
           System.out.println("10000 array, Trial " + (i+1) + ": ");
           long trialStart10k = System.nanoTime();
           int index = binarySearch(arr10k, test[i]); 
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
       System.out.println("Executing Binary Search algorithm..");

       startTime = System.nanoTime();
       for(int i = 0; i < test.length; i++)
       {
           System.out.println("100000 array, Trial " + (i+1) + ": ");
           long trialStart100k = System.nanoTime();
           int index = binarySearch(arr100k, test[i]); 
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

    public static int binarySearch(int[] arr, int x)
    {
        int low = 0;
        int high = arr.length;
        int location;

        while(low < high)
        {
            int center = (low + high)/2;
            if (x > arr[center])
            {
                low = center + 1;
            }
            else {high = center;}
            
            if(x == arr[low])
            {
                location = low;
            }
            else{location = -1;}

            return location;
        }

        return -1;
    }
}