package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'gradingStudents' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY grades as parameter.
	 */

	public static List<Integer> gradingStudents(List<Integer> grades) {
		int mod = 0;
		int auxGrade = 0;
		List<Integer> gradesRounded = new ArrayList<Integer>();
		for (Integer grade : grades) {
			auxGrade = grade.intValue();
			if (auxGrade > 37) {
				mod = auxGrade % 5;
				if (mod > 2) {
					auxGrade += (5 - mod); 
				}
			}
			gradesRounded.add(new Integer(auxGrade));
		}
		return gradesRounded;
	}

}

public class GradingStudents {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Integer::parseInt).collect(toList());

		List<Integer> result = Result.gradingStudents(grades);

		//bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");
		result.stream().forEach(System.out::println);
		
		bufferedReader.close();
		//bufferedWriter.close();
	}
}
