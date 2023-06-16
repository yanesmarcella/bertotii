package org.park;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Livro> livros = new LinkedList<Livro>();
	private List<Especificacao> espec = new LinkedList<Especificacao>();

	public Model() {
		addLivro(new Livro("O iluminado", new Especificacao("terror", "intrinseca")));
		addLivro(new Livro("A cinco passos de você", new Especificacao("romance","intriseca")));
		//addEspecificacao(new Especificacao("terror", "intrinseca"));
}
	
	public void addLivro(Livro livro){
		livros.add(livro);
	}
	
	public Livro buscarTitulo(String titulo){
		for(Livro livro: livros){
			if(livro.getTitulo().equals(titulo)) return livro;
		}
		
		return null;
	}
	
	
	public List<Livro> buscarEspecificacao(Especificacao esp){
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
		
		for(Livro livro:livros){
			 if(esp.comparar(livro.getEspc())) livrosEncontrados.add(livro);
		}
		
		return livrosEncontrados;
		
	}
	
	
	public List<Livro> buscarGenero(String genero){
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
		for(Livro livro:livros) {
			if(livro.getEspc().getGenero().equals(genero)) livrosEncontrados.add(livro);
		}
		return livrosEncontrados;
	}
	
	public List<Livro> getLivros(){
		return livros;
	}

}
