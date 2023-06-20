import java.util.*;

public class Main {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		// Read the number of test casese.		
		int Test = sc.nextInt();
		while (Test-- > 0) {
			// Read the numbers a and b.
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			// Compute the sum of a and b.
			int ans = a + b;
			System.out.println(ans);
		}
	}
}

	
