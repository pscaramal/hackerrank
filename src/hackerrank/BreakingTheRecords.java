package hackerrank;

import java.io.*;
import java.util.*;

public class BreakingTheRecords {

	// Complete the breakingRecords function below.
	static int[] breakingRecords(int[] scores) {
		int[] records = new int[2];
		
		int countHihgest = 0;
		int countLowest = 0;
		int highestScore = scores[0];
		int lowestScore = scores[0];
		
		for (int i = 0; i < scores.length; i++){
			if (scores[i] > highestScore) {
				countHihgest++;
				highestScore = scores[i];
			}
			
			if (scores[i] < lowestScore) {
				countLowest++;
				lowestScore = scores[i];
			}
		}
		
		records[0] = countHihgest;
		records[1] = countLowest;
		
		return records;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] scores = new int[n];

		String[] scoresItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		int[] result = breakingRecords(scores);

		Arrays.stream(result).forEach(System.out::println);
/*		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();*/

		scanner.close();
	}
}
