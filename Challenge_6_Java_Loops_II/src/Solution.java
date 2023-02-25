import java.util.*;
import java.math.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int q = sca.nextInt();
		for (int i = 0; i < q; i++) {
			int a = sca.nextInt();
			int b = sca.nextInt();
			int n = sca.nextInt(); // Number of series
			
			double start = (a + Math.pow(2, 0) * b);
			System.out.print((int)start + " ");
			
			for (int j = 1; j < n; j++) {
				start += (Math.pow(2, j) * b);
				System.out.print((int)start + " ");
			}
			System.out.print("\n");
		}
		
		sca.close();
	}

}
