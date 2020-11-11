// filename: PigeonholeSort.java
// author: Chiebuka Lebechi
// modified: 17 OCT 2020

import java.util.Random;
import java.util.*; 
  
public class PigeonholeSort 
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
        }
          
        long startTime = System.nanoTime();
        pigeonhole_sort(arr1k,arr1k.length); 
        pigeonhole_sort(arr1k,arr1k.length); 
        pigeonhole_sort(arr1k,arr1k.length); 
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long avg1k = elapsedTime/3;
        System.out.println("Average runtime of pigeonholeSort on 1k array: " + avg1k + " nanoseconds.");

        startTime = System.nanoTime();
        pigeonhole_sort(arr10k,arr10k.length); 
        pigeonhole_sort(arr10k,arr10k.length); 
        pigeonhole_sort(arr10k,arr10k.length); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg10k = elapsedTime/3;
        System.out.println("Average runtime of pigeonholeSort on 10k array: " + avg10k + " nanoseconds.");
        

        startTime = System.nanoTime();
        pigeonhole_sort(arr100k,arr100k.length); 
        pigeonhole_sort(arr100k,arr100k.length); 
        pigeonhole_sort(arr100k,arr100k.length); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg100k = elapsedTime/3;
        System.out.println("Average runtime of pigeonholeSort on 100k array: " + avg100k + " nanoseconds.");

        startTime = System.nanoTime();
        pigeonhole_sort(arr1M,arr1M.length); 
        pigeonhole_sort(arr1M,arr1M.length); 
        pigeonhole_sort(arr1M,arr1M.length); 
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        long avg1M = elapsedTime/3;
        System.out.println("Average runtime of pigeonholeSort on 1M array: " + avg1M + " nanoseconds.");
    } 

    public static void pigeonhole_sort(int arr[], 
                                           int n) 
    { 
        int min = arr[0]; 
        int max = arr[0]; 
        int range, i, j, index;  
  
        for(int a=0; a<n; a++) 
        { 
            if(arr[a] > max) 
                max = arr[a]; 
            if(arr[a] < min) 
                min = arr[a]; 
        } 
  
        range = max - min + 1; 
        int[] phole = new int[range]; 
        Arrays.fill(phole, 0); 
  
        for(i = 0; i<n; i++) 
            phole[arr[i] - min]++; 
  
          
        index = 0; 
  
        for(j = 0; j<range; j++) 
            while(phole[j]-->0) 
                arr[index++]=j+min; 
  
    }   
} 