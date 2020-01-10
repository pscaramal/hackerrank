package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class MagicSquare {

	// Complete the formingMagicSquare function below.
	static int formingMagicSquare(int[][] s) {
		System.out.println(isAMagicSquare(s));
		return 0;
	}

	static boolean isAMagicSquare(int[][] square){
		List<Integer> listOfElements = new ArrayList<Integer>();
		for(int[] array : square){
			listOfElements.addAll(Arrays.stream(array).boxed().collect(Collectors.toList()));
		}
		
		if (listOfElements.stream().reduce(0, (subtotal, element) -> subtotal + element) != 45){
			return false;
		}
		
		if (listOfElements.stream().sorted().distinct().collect(Collectors.toList()).size() != 9){
			return false;
		}
		
		int squareLength = square.length;
		int soma = 0;
		//verify lines
		for(int i = 0; i < squareLength; i++){
			soma = 0;
			for (int j = 0; j < squareLength; j++){
				soma += square[i][j];
			}
			if(soma != 15){
				return false;
			}
		}
		
		//verify columns
		for(int i = 0; i < squareLength; i++){
			soma = 0;
			for(int j = 0; j < squareLength; j++){
				soma += square[j][i];
			}
			if(soma != 15){
				return false;
			}
		}
		
		//verify diagonals
		int x = 0;
		int y = 0;
		soma = 0;
		while(x < squareLength){
			soma += square[x][y];
			x++;
			y++;
		}
		if (soma != 15){
			return false;
		}
		
		x = 0;
		y = squareLength - 1;
		soma = 0;
		while(x < squareLength){
			soma += square[x][y];
			x++;
			y--;
		}
		if (soma != 15){
			return false;
		}
		
		return true;
	}
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int[][] s = new int[3][3];

		for (int i = 0; i < 3; i++) {
			String[] sRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int sItem = Integer.parseInt(sRowItems[j]);
				s[i][j] = sItem;
			}
		}

		System.out.println(formingMagicSquare(s));

/*		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();*/

		scanner.close();
	}
}
