package exercicios_Stream_API;

import java.util.Arrays;
import java.util.List;

public class Oito_SomarDigitos {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Integer resultado = numeros.stream().mapToInt(num -> num).sum();
		
		System.out.println(resultado);
	}

}
