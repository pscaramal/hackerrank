package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class PickingNumbers {

	/*
	 * Complete the 'pickingNumbers' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static int pickingNumbers(List<Integer> a) {
		List<Integer> finalList = new ArrayList<Integer>();
		List<Integer> auxiliarList = new ArrayList<Integer>();

		for (int i = 0; i < a.size(); i++) {
			auxiliarList.clear();
			auxiliarList.add(a.get(i));

			for (int j = 0; j < a.size(); j++) {
				if (i != j) {
					if (isAValidNumber(a.get(j), auxiliarList)) {
						auxiliarList.add(a.get(j));
					}
				}
			}

			if (auxiliarList.size() > finalList.size()) {
				finalList.clear();
				finalList.addAll(auxiliarList);
			}
		}

		return finalList.size();
	}

	public static boolean isAValidNumber(Integer number, List<Integer> auxiliarList) {

		for (int i = 0; i < auxiliarList.size(); i++) {
			if (Math.abs(number - auxiliarList.get(i)) > 1) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		System.out.println(pickingNumbers(a));

		/*
		 * bufferedWriter.write(String.valueOf(result));
		 * bufferedWriter.newLine();
		 */

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
