package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
	//atributos
	private List<Integer> numberList;
	
	//construtor
	public OrdenacaoNumeros() {
		this.numberList = new ArrayList<>();
	}
	
	//metodos
	
	public void addNumber(int number) {
		this.numberList.add(number);
	}
	
	public List<Integer> sortAscending() {
		List<Integer> numbersOrderAscending = new ArrayList<>(this.numberList);
		if(!numberList.isEmpty()) {
			Collections.sort(numbersOrderAscending);
			return numbersOrderAscending;
		}else {
			throw new RuntimeException("A lista está vazia !");
		}
	}
	
	public List<Integer> sortDescending(){
		List<Integer> numbersOrderDescending = new ArrayList<>(this.numberList);
		if(!numberList.isEmpty()) {
			numbersOrderDescending.sort(Collections.reverseOrder());
			return numbersOrderDescending;
		}else {
			throw new RuntimeException("A lista está vazia !");
		}
	}
	
	public static void main(String[] args) {
		OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
		ordenacaoNumeros.addNumber(7);
		ordenacaoNumeros.addNumber(2);
		ordenacaoNumeros.addNumber(5);
		ordenacaoNumeros.addNumber(1);
		ordenacaoNumeros.addNumber(10);
		ordenacaoNumeros.addNumber(88);
		
		System.out.println("Numeros ordem ascendente: " + ordenacaoNumeros.sortAscending());
		System.out.println("Numeros ordem descendente: " + ordenacaoNumeros.sortDescending());
;	}

}
