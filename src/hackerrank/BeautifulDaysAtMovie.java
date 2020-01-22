package hackerrank;

import java.io.*;
import java.util.*;

public class BeautifulDaysAtMovie {

	// Complete the beautifulDays function below.
	static int beautifulDays(int i, int j, int k) {
		int numberOfBeatifulDays = 0;
		
		for(int currentDay = i; currentDay <= j; currentDay++){

			if (Math.abs(currentDay - reversedDayNumber(currentDay)) % k == 0){
				numberOfBeatifulDays++;
			}
		}
		
		return numberOfBeatifulDays;
	}

	static int reversedDayNumber(int currentDay) {
		int reversedNumber = 0;
		String[] splitNumber = Integer.valueOf(currentDay).toString().split("(?!^)");
		int multiplier = (int) Math.pow(10, splitNumber.length - 1);
		
		for (int i = splitNumber.length - 1; i >= 0; i--){
			reversedNumber += (multiplier * Integer.parseInt(splitNumber[i]));
			multiplier /= 10;
		}
		
		return reversedNumber;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] ijk = scanner.nextLine().split(" ");

		int i = Integer.parseInt(ijk[0]);

		int j = Integer.parseInt(ijk[1]);

		int k = Integer.parseInt(ijk[2]);

		System.out.println(beautifulDays(i, j, k));

/*		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();*/

		scanner.close();
	}
}
