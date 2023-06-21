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
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=1;i<=t;i++){
		    int count = 0;
		    int n = sc.nextInt();
		    int[] d = new int[n];
		    for(int j=0;j<n;j++){
		        d[j]=sc.nextInt();
		        if(d[j]>=1000)
		        count++;
		    }
		    System.out.println(count);
		}
		
	}
}
