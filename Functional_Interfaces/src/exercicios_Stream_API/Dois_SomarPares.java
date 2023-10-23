package exercicios_Stream_API;

import java.util.Arrays;
import java.util.List;

public class Dois_SomarPares {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int resultadoPares = numeros.stream().filter(num -> num % 2 == 0).mapToInt(num -> num).sum();
		
		System.out.println(resultadoPares);
	}

}
