package hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MigratoryBirds {

	// Complete the migratoryBirds function below.
	static int migratoryBirds(List<Integer> arr) {
		//Verificar se o array está vazio, e já retorna 0
		if (arr.size() == 0) {
			return 0;
		}
		
		Map<Integer, Integer> birds = new HashMap<>();
		Map<Integer, Integer> orderedMap = new LinkedHashMap<>();

		//Cria um map, criando um contador para cada pássaro
		for (Integer bird : arr) {
			if (birds.containsKey(bird)) {
				birds.put(bird, birds.get(bird) + 1);
			} else {
				birds.put(bird, 1);
			}
		}

		//Ordena o map por valor em ordem descendente.
		//Ou seja, os que estiverem com o contador maior ficam na frente
		//Copiando os valores para o LinkedHashMap, pois, este mantem a ordem em que os elementos são inseridos
		birds.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> orderedMap.put(x.getKey(), x.getValue()));
		
		return orderedMap.entrySet().stream()
				//filtra o map ordenado pelo valor do primeiro elemento
				.filter(bird -> bird.getValue().equals(orderedMap.entrySet().iterator().next().getValue()))
				//pego apenas as chaves dos elementos filtrados
				.map(Map.Entry::getKey)
				//transformo em uma lista
				.collect(Collectors.toList())
					//transformo a lista em stream novamente
					//ordeno e pego somente o primeiro valor
					//o método findFirst retorna um Optional
					.stream().sorted().findFirst().get();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = migratoryBirds(arr);

		System.out.println(result);
		/*
		 * bufferedWriter.write(String.valueOf(result));
		 * bufferedWriter.newLine();
		 */

		bufferedReader.close();
		// bufferedWriter.close();
	}

}
