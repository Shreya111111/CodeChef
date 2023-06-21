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
		Scanner input=new Scanner(System.in);
		int test=input.nextInt();
		while(test-->0){
		    int N,K,count=0;
		    N=input.nextInt(); K=input.nextInt();
		    int arr[]=new int[N];
		    for(int i=0;i<N;i++)
		    {
		        arr[i]=input.nextInt();
		        if(arr[i]>K) count++;
		    }
		    System.out.println(count);
		}
	}
}
