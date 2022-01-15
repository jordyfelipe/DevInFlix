package devinflix.entidades;

import java.util.HashMap;

public class Catalogo {

	HashMap<String, Conteudo> conteudos;

	public Catalogo() {
		conteudos = new HashMap<String, Conteudo>();
	}

	public HashMap<String, Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(HashMap<String, Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

}
