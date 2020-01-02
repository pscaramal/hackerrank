package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class ResultBetweenTwoSets {

	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * following parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here
		List<Integer> listA = a.stream().sorted().collect(toList());
		List<Integer> listB = b.stream().sorted().collect(toList());
		
		int initialNumber = listA.get(listA.size() - 1);
		final int finalNumber = listB.get(listB.size() - 1);
		int count = 0;
		boolean isAValidNumber;
		
		while (initialNumber <= finalNumber) {
			isAValidNumber = true;
			for (int i = 0; i < listA.size(); i++) {
				if (initialNumber % listA.get(i) != 0) {
					isAValidNumber = false;
					break;
				}
			}
			if(isAValidNumber){
				for (int i = 0; i < listB.size(); i++) {
					if (listB.get(i) % initialNumber != 0) {
						isAValidNumber = false;
						break;
					}
				}
			}
			if(isAValidNumber){
				count++;
			}
			initialNumber++;
		}
		
		return count;
	}

}

public class BetweenTwoSets {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int total = ResultBetweenTwoSets.getTotalX(arr, brr);
		System.out.println(total);
		//bufferedWriter.write(String.valueOf(total));
		//bufferedWriter.newLine();

		bufferedReader.close();
		//bufferedWriter.close();
	}
}
