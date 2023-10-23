package exercicios_Stream_API;

import java.util.Arrays;
import java.util.List;

public class Tres_VerificarNumerosPositivos {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, -2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean todosPositivos = numeros.stream().allMatch(num -> num > 0);
		String mensagem = todosPositivos ? "Todos os numeros do Array são positivos !" : "Algum numero do Array é negativo !";
		
		System.out.println(mensagem);
	}

}
