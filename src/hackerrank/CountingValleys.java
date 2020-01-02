package hackerrank;

import java.io.*;
import java.util.*;

public class CountingValleys {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		String[] hikeSteps = s.split("(?!^)");
		boolean isValley = false;
		int numberOfValleys = 0;
		int level = 0;
		
		for (String step : hikeSteps){
			if(step.equals("U")){
				level++;
			} 
			if(step.equals("D")){
				level--;
			}
			
			if(level < 0){
				isValley = true;
			}
			
			if(isValley){
				if(level == 0){
					isValley = false;
					numberOfValleys++;
				}
			}
		}
        
		return numberOfValleys;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		System.out.println(countingValleys(n, s));

/*		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();
*/
		scanner.close();
	}
}
