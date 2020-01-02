package hackerrank;

import java.io.*;
import java.util.*;

public class CatsAndAMouse {

	// Complete the catAndMouse function below.
	static String catAndMouse(int x, int y, int z) {
		//x = cat A
		//y = cat B
		//z = mouse
		int distanceCatAToMouse = Math.abs(z - x);
		int distanceCatBToMouse = Math.abs(z - y);
			
		if (distanceCatAToMouse < distanceCatBToMouse){
			return "Cat A";
		}
		
		if (distanceCatBToMouse < distanceCatAToMouse){
			return "Cat B";
		}
		
		return "Mouse C";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String[] xyz = scanner.nextLine().split(" ");

			int x = Integer.parseInt(xyz[0]);

			int y = Integer.parseInt(xyz[1]);

			int z = Integer.parseInt(xyz[2]);

			System.out.println(catAndMouse(x, y, z));

/*			bufferedWriter.write(result);
			bufferedWriter.newLine();*/
		}

		//bufferedWriter.close();

		scanner.close();
	}
}
