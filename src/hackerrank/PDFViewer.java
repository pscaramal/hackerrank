package hackerrank;

import java.io.*;
import java.util.*;

public class PDFViewer {

	// Complete the designerPdfViewer function below.
	static int designerPdfViewer(int[] h, String word) {
		String [] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String [] letters = word.split("(?!^)");
		int tallestLetter = 0;

		for (int i = 0; i < letters.length; i++){
			for (int j = 0; j < alphabet.length; j++){
				if (letters[i].equalsIgnoreCase(alphabet[j])){
					if(tallestLetter < h[j]){
						tallestLetter = h[j];
					}
					break;
				}
			}
		}
		
		return tallestLetter * letters.length;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int[] h = new int[26];

		String[] hItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 26; i++) {
			int hItem = Integer.parseInt(hItems[i]);
			h[i] = hItem;
		}

		String word = scanner.nextLine();

		System.out.println(designerPdfViewer(h, word));

/*		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();*/

		scanner.close();
	}
}
