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
	int t = sc.nextInt();
	for(int i =1;i<=t;i++){
	    int l = sc.nextInt(), r = sc.nextInt();
	    int c=0;
	    for(int n = l;n<=r;n++){
	        int h = n%10;
	        if(h == 2|| h==3||h==9){
	            c++;
	        }
	    }
	    System.out.println(c);
	}
	
	}
}