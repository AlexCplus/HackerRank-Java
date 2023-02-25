import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		InputStreamReader inputstream = new InputStreamReader(System.in);
		BufferedReader bufferedreader = new BufferedReader(inputstream);
		
		try {
			int N = Integer.parseInt(bufferedreader.readLine());
			for (int i = 1; i <= 10; i++) {
				System.out.println(N + " x " + i + " = " + N*i );
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
