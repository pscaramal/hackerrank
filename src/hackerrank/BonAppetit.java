package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class BonAppetit {

	// Complete the bonAppetit function below.
	static void bonAppetit(List<Integer> bill, int k, int b) {
		int soma = 0;
		for (int i = 0; i < bill.size(); i++){
			if (i != k){
				soma += bill.get(i);
			}
		}
		int division =  soma / 2;
		
		if (b > (division)){
			System.out.printf("%d\n", b - division);
		} else {
			System.out.println("Bon Appetit");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int b = Integer.parseInt(bufferedReader.readLine().trim());

		bonAppetit(bill, k, b);

		bufferedReader.close();
	}
}
