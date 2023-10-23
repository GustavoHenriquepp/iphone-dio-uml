package examples;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um
 * resultado do mesmo tipo T. É usada para realizar operações de redução em
 * pares de elementos, como somar números ou combinar objetos.
 */
public class BinaryOperator {
	public static void main(String[] args) {
		// Criar uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

		java.util.function.BinaryOperator<Integer> soma = (n1, n2) -> n1 + n2;
		
		Integer resultado = numeros.stream().reduce(0,soma);
		System.out.println(resultado);
	}
}