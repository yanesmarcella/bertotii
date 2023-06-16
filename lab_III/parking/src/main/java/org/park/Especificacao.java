package org.park;

public class Especificacao {

	
	private String genero;
	private String editora;
	
	
	
	public Especificacao(String genero, String editora){
		this.genero = genero;
		this.editora = editora;
	}
	
	public String getGenero(){
		return genero;
	}
	
	public String getEditora(){
		return editora;
	}
	
	
	
	
	public boolean comparar(Especificacao esp){
		if(genero.equals(esp.genero) && editora.equals(esp.editora)){
			return true;
		} else {
			return false;
		}
	}
	
}
