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
		int abc=0;
		int arr[]= new int[4];
		for(int i=0;i<4;i++)
		arr[i] = sc.nextInt();
		for(int i=0;i<4;i++){
		    if(arr[i]>=10)
		    abc++;
		}
		System.out.println(abc);
	}
}
