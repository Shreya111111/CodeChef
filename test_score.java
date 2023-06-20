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
		int sum = 0, count = 0;
		Scanner read = new Scanner(System.in);
		int T = read.nextInt();
		while(T>0)
		{   
		    int N = read.nextInt();
		    int X = read.nextInt();
		    int Y = read.nextInt();
		    for( int i=0 ; i <= N ; i++)
		    {
		        sum = X * i;
		        if( sum == Y)
		        {
		            count++;
		        }
		    }
		        if( count > 0)
		    {
		        System.out.println("YES");
		    }
		    else System.out.println("NO");
		    T--;
		    count=0;
		}
	}
}
