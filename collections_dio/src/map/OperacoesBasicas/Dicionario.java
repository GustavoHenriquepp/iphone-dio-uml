package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	//atributos
	private Map<String, String> dicionarioMap;
	
	//construtor
	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}
	
	//metodos
	public void adicionarPalavra(String palavra, String definicao) {
		this.dicionarioMap.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			this.dicionarioMap.remove(palavra);
		}else {
			throw new RuntimeException("O dicionario está vazio !");
		}
	}
	
	public Map<String, String> exibirPalavras(){
		return dicionarioMap;
	}
	
	public String pesquisarPorPalavra(String palavra){
		String palavraPesquisada = null;
		if(!dicionarioMap.isEmpty()) {
			palavraPesquisada = dicionarioMap.get(palavra);
			return palavraPesquisada;
		}else {
			throw new IllegalArgumentException("Palavra Invalida !");
		}
	}
	
	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		dicionario.adicionarPalavra("Palavra Um", "Definição 1");
		dicionario.adicionarPalavra("Palavra Dois", "Definição 2");
		dicionario.adicionarPalavra("Palavra Tres", "Definição 3");
		dicionario.adicionarPalavra("Palavra Quatro", "Definição 4");
		dicionario.adicionarPalavra("Palavra Cinco", "Definição 5");
		
		System.out.println(dicionario.exibirPalavras());
		dicionario.removerPalavra("Palavra Dois");
		System.out.println(dicionario.exibirPalavras());
		System.out.println(dicionario.pesquisarPorPalavra("Palavra Quatro"));
	}

}
