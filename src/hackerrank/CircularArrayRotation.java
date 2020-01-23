package hackerrank;

import java.io.*;
import java.util.*;


public class CircularArrayRotation {

	// Complete the circularArrayRotation function below.
	static int[] circularArrayRotation(int[] a, int k, int[] queries) {
		int arrayLength = a.length;
		int queriesLength = queries.length;
		
		int[] newQueryPositions = new int[queriesLength];
		int[] newArrayPositions = new int[arrayLength];
		
		for (int i = 0; i < arrayLength; i++){
			int newPosition = (i + k) % arrayLength;
			newArrayPositions[newPosition] = a[i];
		}
		
		int index;
		for (int i = 0; i < queriesLength; i++){
			index = queries[i];
			newQueryPositions[i] = newArrayPositions[index];
		}
		
		return newQueryPositions;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nkq = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nkq[0]);

		int k = Integer.parseInt(nkq[1]);

		int q = Integer.parseInt(nkq[2]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] queries = new int[q];

		for (int i = 0; i < q; i++) {
			int queriesItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			queries[i] = queriesItem;
		}

		int[] result = circularArrayRotation(a, k, queries);

		for (int i = 0; i < result.length; i++) {
			System.out.print(String.valueOf(result[i]));
			if (i != result.length - 1) {
				System.out.println();
			}
		}

		System.out.println();

		scanner.close();
	}
}
