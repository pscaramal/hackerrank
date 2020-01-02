package hackerrank;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		
		Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})(\\w{2})");
		Matcher matcher = pattern.matcher(s);
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		String ampm = null;
		
		if (matcher.find()) {
			hours = Integer.parseInt(matcher.group(1));
			minutes = Integer.parseInt(matcher.group(2));
			seconds = Integer.parseInt(matcher.group(3));
			ampm = matcher.group(4);
		}
		
		if (ampm.equals("PM")) {
			if (hours == 12) {
				hours = 12;
			} else {
				hours += 12;
			}
		} else {
			if (hours == 12) {
				hours = 0;
			}
		}
		
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);

		System.out.println(result);
		//bw.write(result);
		//bw.newLine();

		//bw.close();
	}
}
