package org.park;

public class Livro {

	private String titulo;
	private Especificacao espc;
	
	
	public Livro(String titulo, Especificacao espc){
		this.titulo = titulo;
		this.espc = espc;
		
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public Especificacao getEspc(){
		return espc;
	}
	
	
}
