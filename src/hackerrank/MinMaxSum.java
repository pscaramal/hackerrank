package hackerrank;

import java.util.*;

public class MinMaxSum {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		//sort array
		int aux;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[i]){
					aux = arr[i];
					arr[i] = arr[j];
					arr[j] = aux;
				}	
			}
		}

		//sum values
		long sumMax = 0;
		long sumMin = 0;
		int indexMax = 1;
		int indexMin = arr.length - 2;
		
		while (indexMax < arr.length) {
			sumMax += arr[indexMax];
			sumMin += arr[indexMin];
			
			indexMax++;
			indexMin--;
		}
		
		System.out.print(sumMin);
		System.out.print(" ");
		System.out.print(sumMax);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}
