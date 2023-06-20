import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
          Scanner inp=new Scanner(System.in);
          int t=inp.nextInt();
          while(t-->0){
              int a,b,c; a=inp.nextInt(); b=inp.nextInt(); 
              c=inp.nextInt();
              if(c>=a && c<b) System.out.println("YES");
              else System.out.println("NO");
          }
	}
}
