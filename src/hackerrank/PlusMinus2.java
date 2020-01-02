package hackerrank;

import java.util.Scanner;

public class PlusMinus2 {

	static void plusMinus(int[] arr) {
		long tempoInicial = System.currentTimeMillis();
		
		long positivos = 0;
		long negativos = 0;
		long zeros = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positivos++;
			} else {
				if (arr[i] < 0) {
					negativos++;
				} else {
					zeros++;
				}
			}
		}
		System.out.printf("%.6f\n", (double) positivos / arr.length);
		System.out.printf("%.6f\n", (double) negativos / arr.length);
		System.out.printf("%.6f\n", (double) zeros / arr.length);
		
		System.out.println(System.currentTimeMillis() - tempoInicial);
	}
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
