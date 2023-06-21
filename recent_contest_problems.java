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
            while(t>0){
                int cs = 0, cl = 0;
                int nw = sc.nextInt();
                while(nw >0){
                    String w = sc.next();
                    if(w.equals("START38")){
                        cs++;
                    } else{
                        cl++;
                    }
                    nw--;
                }
                System.out.println(cs + " " + cl);
                t--;
            }
	}
}
