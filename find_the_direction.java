/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++){
		    int x = read.nextInt();
		    int y = x%4;
		    if(y==0){
		        System.out.println("North");
		    }
		    else if(y==1){
		        System.out.println("East");
		    }
		    else if(y==2){
		        System.out.println("South");
		    }
		    else{
		        System.out.println("West");
		    }
		}
	}
}
