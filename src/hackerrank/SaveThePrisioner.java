package hackerrank;

import java.io.*;
import java.util.*;

public class SaveThePrisioner {

	// Complete the saveThePrisoner function below.
	static int saveThePrisoner(int n, int m, int s) {
		int prisionerWarn = 0;
		
		int mod = ((m % n) + s) - 1 ;
		System.out.println(mod);
		if (mod == 0) {
			prisionerWarn = n;
		} else {
			if (mod <= n){
				prisionerWarn = mod;
			} else {
				prisionerWarn = mod - n;
			}
		}

		return prisionerWarn;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String[] nms = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nms[0]);

			int m = Integer.parseInt(nms[1]);

			int s = Integer.parseInt(nms[2]);

			System.out.println(saveThePrisoner(n, m, s));

/*			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();*/
		}

		//bufferedWriter.close();

		scanner.close();
	}
}
