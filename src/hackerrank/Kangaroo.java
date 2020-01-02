package hackerrank;

import java.io.*;
import java.util.*;

public class Kangaroo {

	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2) {
		long kangarooSlower = (v1 <= v2) ? x1 : x2;
		final int speedKangarooSlower = (v1 <= v2) ? v1 : v2;
		long kangarooFaster = (v1 > v2) ? x1 : x2;
		final int speedKangarooFaster = (v1 >= v2) ? v1 : v2;
		
		while (kangarooSlower >= kangarooFaster) {
			kangarooSlower += speedKangarooSlower;
			kangarooFaster += speedKangarooFaster;
			if (kangarooSlower == kangarooFaster) {
				return "YES";
			}
		}
		return "NO";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] x1V1X2V2 = scanner.nextLine().split(" ");

		int x1 = Integer.parseInt(x1V1X2V2[0]);

		int v1 = Integer.parseInt(x1V1X2V2[1]);

		int x2 = Integer.parseInt(x1V1X2V2[2]);

		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);

		System.out.println(result);
/*		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();*/

		scanner.close();
	}
}
