package edu.gustavo.projeto.phone;

import edu.gustavo.projeto.interfaces.AparelhoTelefonico;
import edu.gustavo.projeto.interfaces.NavegadorInternet;
import edu.gustavo.projeto.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	private boolean aparelhoDesbloqueado = false;
	private String senha;

	public Iphone(String senha) {
		this.senha = senha;
	}

	public void desbloquearAparelho(String senha) {
		if (this.senha.equals(senha)) {
			aparelhoDesbloqueado = true;
			System.out.println("Aparelho desbloqueado !");
		} else {
			System.out.println("Senha incorreta !");
		}
	}
	
	public void bloquearAparelho() {
		this.aparelhoDesbloqueado = false;
		System.out.println("Aparelho bloqueado !");
	}

	public void verificarDesbloqueio() {
		if (!aparelhoDesbloqueado) {
			System.out.println("Aparelho bloqueado !");
		}
	}

	@Override
	public void tocar(String musica) {
		verificarDesbloqueio();
		if (aparelhoDesbloqueado)
			System.out.println("Reproduzindo " + musica);
	}

	@Override
	public void pausar() {
		verificarDesbloqueio();
		if (aparelhoDesbloqueado)
			System.out.println("Musica pausada !");
	}

	@Override
	public void selecionarMusica(String musica) {
		verificarDesbloqueio();
		if (aparelhoDesbloqueado)
			System.out.println("Musica " + musica + " selecionada !");
		tocar(musica);
	}

	@Override
	public void abrirNavegador() {
		verificarDesbloqueio();
		if (aparelhoDesbloqueado)
			System.out.println("Navegador aberto !");
	}

	@Override
	public void exibirPagina(String url) {
		verificarDesbloqueio();
		if (aparelhoDesbloqueado)
			System.out.println("Exibindo pagina do URL: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		verificarDesbloqueio();
		if (aparelhoDesbloqueado)
			System.out.println("Nova aba aberta !");
	}

	@Override
	public void atualizarPagina() {
		verificarDesbloqueio();
		if (aparelhoDesbloqueado)
			System.out.println("Pagina atualizada !");
	}

	@Override
	public void fecharNavegador() {
		verificarDesbloqueio();
		if (aparelhoDesbloqueado)
			System.out.println("Fechando navegador !");
	}

	@Override
	public void ligar(String numero) {
		verificarDesbloqueio();
		if (aparelhoDesbloqueado)
			System.out.println("Ligando para " + numero);
	}

	@Override
	public void atender() {
		verificarDesbloqueio();
		if (aparelhoDesbloqueado)
			System.out.println("Chamada atendida !");
	}

	@Override
	public void iniciarCorreioVoz() {
		verificarDesbloqueio();
		if (aparelhoDesbloqueado)
			System.out.println("Reproduzindo correio de voz");
	}
}
