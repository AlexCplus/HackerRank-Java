import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader bufferedreader = new BufferedReader(input);
	
		try {
			int lineNumber = 1;
			String line = bufferedreader.readLine();
			while (line != null) {
				System.out.println(lineNumber + " " + line);
				line = bufferedreader.readLine();
				lineNumber++;
			}
		}catch(Exception e) {
			
		}
	}

}
