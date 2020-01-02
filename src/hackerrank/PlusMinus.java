package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	long tempoInicial = System.currentTimeMillis();
    	List<Double> results = new ArrayList<Double>();
    	//positives
    	results.add((double) Arrays.stream(arr).filter(number -> number > 0).count() / arr.length);
    	//negatives
    	results.add((double) Arrays.stream(arr).filter(number -> number < 0).count() / arr.length);
    	//zeros
    	results.add((double) Arrays.stream(arr).filter(number -> number == 0).count() / arr.length);
    	
    	results.stream()
    			.forEach(ratioOfElements -> System.out.printf("%.6f\n",  ratioOfElements));
    	
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
