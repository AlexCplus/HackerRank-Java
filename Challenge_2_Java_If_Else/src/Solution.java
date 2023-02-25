import java.util.*;

public class Solution {

	private static final Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int N = s.nextInt();
		s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		s.close();
		
		if (N % 2 == 0) { // It means that it's even
			if (N >= 2 && N <= 5) {
				System.out.println("Not Weird");
			}else if (N >= 6 && N <= 20) {
				System.out.println("Weird");
			}else {
				System.out.println("Not Weird");
			}
		}else { // In other case it's odd
			System.out.println("Weird");
		}
	}

}
