package hackerrank;

import java.io.*;
import java.util.*;

public class ViralAdvertising {

	// Complete the viralAdvertising function below.
	static int viralAdvertising(int n) {
		int numberOfLikes = 0;
		int shared = 5;
		
		for (int i = 0; i < n; i++){
			numberOfLikes += shared / 2;
			
			shared = (shared / 2) * 3;
		} 
		
		return numberOfLikes;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		System.out.println(viralAdvertising(n));

/*		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();*/

		scanner.close();
	}
}
