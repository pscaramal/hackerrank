package hackerrank;

import java.util.*;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
    	for (int line = 1; line <= n; line++){
    		int spaces = n - line;
    		for(int i = 0; i < spaces; i++) {
    			//printing spaces
    			System.out.print(" ");
    		}
    		for(int i = 0; i < line; i ++) {
    			//printing '#'
    			System.out.print("#");
    		}
    		System.out.println();
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
