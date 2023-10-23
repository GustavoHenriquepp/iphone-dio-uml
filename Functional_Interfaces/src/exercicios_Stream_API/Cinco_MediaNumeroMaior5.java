package exercicios_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Cinco_MediaNumeroMaior5 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		OptionalDouble resultado = numeros.stream().filter(num -> num > 5).mapToDouble(num -> num).average();
		System.out.println(resultado);
	}

}
