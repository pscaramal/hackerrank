package hackerrank;

import java.io.*;
import java.util.*;

public class UtopianTree {

	// Complete the utopianTree function below.
	static int utopianTree(int n) {
		int treeHeight = 1;
		
		for (int i = 1; i <= n; i++){
			if (i % 2 == 1){
				treeHeight *= 2;
			} else {
				treeHeight++;
			}
			
		}
		return treeHeight;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			System.out.println(utopianTree(n));
/*
			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
*/		}

/*		bufferedWriter.close();*/

		scanner.close();
	}
}
