package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int quantityPairs = 0;
		int quantityColor = 0;
		int currentSockColor = 0;
		int previousSockColor = 0;
		
		List<Integer> orderedSocks = Arrays.stream(ar)
										.boxed()
										.sorted()
										.collect(Collectors.toList());		

		if (!orderedSocks.isEmpty()){
			currentSockColor = orderedSocks.get(0);
			previousSockColor = orderedSocks.get(0);
		}
		
		for (int i = 0; i < orderedSocks.size(); i++){
			currentSockColor = orderedSocks.get(i);
			quantityColor++;
			if (currentSockColor != previousSockColor){
				quantityColor--;
				System.out.println("qt" + quantityColor);
				quantityPairs += quantityColor / 2;
				
				previousSockColor = currentSockColor;
				quantityColor = 1;
			}
		}
			
		quantityPairs += quantityColor / 2;
		
		//orderedSocks.stream().forEach(System.out::println);
		return quantityPairs;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		System.out.println(sockMerchant(n, ar));

/*		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();*/

		scanner.close();
	}
}
