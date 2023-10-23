package exercicios_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nove_NumerosDistintos {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean numerosDistintos = numeros.stream().distinct().count() == numeros.size();
		
		System.out.println(numerosDistintos);
	}

}
