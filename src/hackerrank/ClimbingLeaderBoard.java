package hackerrank;

import java.io.*;
import java.util.*;

public class ClimbingLeaderBoard {

	// Complete the climbingLeaderboard function below.
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		final int aliceLength = alice.length;
		final int scoresLength = scores.length;
		
		List<Integer> ranking = new ArrayList<Integer>();
		int[] alicesPositions = new int[aliceLength];

		ranking.add(scores[0]);
		//int j = 0;
		for (int i = 1; i < scoresLength; i++){
			if(scores[i] < scores[i - 1]){
				ranking.add(scores[i]);
			}
		}
		
		int position = ranking.size() + 1;
		int indeX = ranking.size() - 1;
		for (int i = 0; i < aliceLength; i++) {
			for (int x = indeX; x >= 0; x--){
				if (alice[i] < ranking.get(x)){
					alicesPositions[i] = position;
					break;
				}
				if (alice[i] >= ranking.get(x) && x == 0){
					alicesPositions[i] = 1;
					break;
				}
				position--;
				indeX--;
			}
		}
		
		return alicesPositions;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		File file = new File("C:\\climbing_2.txt"); 
		//BufferedReader br = new BufferedReader(new FileReader(file));
		Scanner sc = new Scanner(file);
		
		//int scoresCount = scanner.nextInt();
		int scoresCount = sc.nextInt();
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int[] scores = new int[scoresCount];

		String[] scoresItems = sc.nextLine().split(" ");
		//String[] scoresItems = scanner.nextLine().split(" ");
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < scoresCount; i++) {
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		int aliceCount = sc.nextInt();
		//int aliceCount = scanner.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] alice = new int[aliceCount];

		String[] aliceItems = sc.nextLine().split(" ");
		//String[] aliceItems = scanner.nextLine().split(" ");
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < aliceCount; i++) {
			int aliceItem = Integer.parseInt(aliceItems[i]);
			alice[i] = aliceItem;
		}

		//long tempoInicial = System.currentTimeMillis();
		//System.out.println(tempoInicial);
		int[] result = climbingLeaderboard(scores, alice);
		//System.out.println(System.currentTimeMillis() - tempoInicial);
		
		Arrays.stream(result).forEach(System.out::println);
		
/*		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write("\n");
			}
		}*/

/*		bufferedWriter.newLine();

		bufferedWriter.close();
*/
		//scanner.close();
		sc.close();
	}
}
