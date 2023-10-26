package edu.gustavo.projeto.teste;

import edu.gustavo.projeto.phone.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone("12345");
		
		iphone.abrirNavegador();
		iphone.desbloquearAparelho("12345");
		iphone.abrirNavegador();
		iphone.exibirPagina("google.com");
		iphone.selecionarMusica("decadence");
		iphone.bloquearAparelho();

	}

}
