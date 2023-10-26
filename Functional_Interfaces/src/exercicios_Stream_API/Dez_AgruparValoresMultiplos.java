package exercicios_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dez_AgruparValoresMultiplos {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		List<Integer> imparesMultiplos3ou5 = numeros.stream().filter(num -> (num % 3 == 0 || num % 5 == 0) && num % 2 == 1).collect(Collectors.toList());
		
		System.out.println(imparesMultiplos3ou5);
	}

}
