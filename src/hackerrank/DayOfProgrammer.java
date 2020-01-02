package hackerrank;

import java.io.*;

public class DayOfProgrammer {

	// Complete the dayOfProgrammer function below.
	static String dayOfProgrammer(int year) {

		//Gregorian Calendar
		if (year > 1918) {
			if (isGregorianLeapYear(year)) {
				return String.format("12.09.%04d", year);
			}
			return String.format("13.09.%04d", year);
		}

		//Julian Calendar
		if(year < 1918){
			if(isJulianLeapYear(year)){
				return String.format("12.09.%04d", year);
			}
			return String.format("13.09.%04d", year);
		}
		
		return String.format("26.09.%04d", year);
	}
	
	static boolean isGregorianLeapYear(int year){
		return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
	}
	
	static boolean isJulianLeapYear(int year) {
		return (year % 4 == 0);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int year = Integer.parseInt(bufferedReader.readLine().trim());

		String result = dayOfProgrammer(year);

		System.out.println(result);

		/*
		 * bufferedWriter.write(result); bufferedWriter.newLine();
		 */

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
