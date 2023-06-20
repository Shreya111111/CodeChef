/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AddNaturalNumbers {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    //int N = sc.nextInt();

    int N = 34;

    long total = 0;
    for (int i = 1; i <= N; i++) {
      total += i;
    }
    System.out.println(total);
  }
}
