package exercicios_Stream_API;

import java.util.Arrays;
import java.util.List;

public class Seis_VerificarNumeroMaiorQue10 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean numeroMaiorQue10 = numeros.stream().anyMatch(num -> num > 10);
		
		System.out.println(numeroMaiorQue10);
	}

}
