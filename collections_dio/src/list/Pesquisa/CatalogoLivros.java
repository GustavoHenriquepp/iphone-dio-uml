package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	// atributo
	private List<Livro> livroList;

	// construtor
	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}

	// metodos
	public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}

	public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 2021);
		catalogoLivros.adicionarLivros("Livro 1", "Autor 2", 2020);
		catalogoLivros.adicionarLivros("Livro 2", "Autor 2", 2022);
		catalogoLivros.adicionarLivros("Livro 3", "Autor 3", 2023);
		catalogoLivros.adicionarLivros("Livro 4", "Autor 4", 1994);
		
//		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
//		System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2020, 2021));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
	}
}
