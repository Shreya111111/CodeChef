/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int [] matches = new int[]{6,2,5,5,4,5,6,3,7,6};
		int T = sc.nextInt();
		while(T>0){
		    
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    
		    int sum = A+B;
		    
		    int matchesRequired = 0;
		    
		    while(sum>0){
		        int rem = sum%10;
		        matchesRequired += matches[rem];
		        sum = sum/10;
		    }
		    
		    System.out.println(matchesRequired);
		    
		    T--;
		}
	}
}
