package hackerrank;

import java.io.*;
import java.util.*;

public class DrawingBook {

	/*
	 * Complete the pageCount function below.
	 */
	static int pageCount(int n, int p) {
		List<int[]> book = new ArrayList<int[]>();
		int startAtBeginning = 0;
		int startAtTheEnd = 0;
		
		//Filling book
		int page = -1;
		while(page < n){
			int sheet[] = new int[2];
			sheet[0] = ++page;
			if (page < n){
				sheet[1] = ++page;
			}
			
			book.add(sheet);
		}
		
		//Count pages turn starting at Beginning
		for (int i = 0; i < book.size(); i++){
			int currentPage[] = book.get(i);
			if(currentPage[0] == p || currentPage[1] == p){
				break;
			}
			startAtBeginning++;
		}
		
		//Count pages turn starting at the end
		for (int i = book.size() - 1; i >= 0 ; i--){
			int currentPage[] = book.get(i);
			if(currentPage[0] == p || currentPage[1] == p){
				break;
			}
			startAtTheEnd++;
		}
		
		return startAtBeginning < startAtTheEnd ? startAtBeginning : startAtTheEnd;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scanner.nextLine());
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int p = Integer.parseInt(scanner.nextLine());
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		System.out.println(pageCount(n, p));
		
/*		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();*/

		scanner.close();
	}
}
