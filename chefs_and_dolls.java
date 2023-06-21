/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		
		for(int m=0; m<test_cases; m++){
		    int size = sc.nextInt();
		    int arr[] = new int[size+1];
		    for(int i=0; i<size; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    Arrays.sort(arr, 0, size);
		    
		  /*  for(int i=0; i<size+1; i++){
		        System.out.print(arr[i]+" ");
		    }*/
		   
		    for(int j=0; j<size+1; j+=2){
		        
		        if(arr[j]!= arr[j+1]){
		            System.out.println(arr[j]);
		            break;
		        }
		        
		    }
		    
		    
		}
	}
}
