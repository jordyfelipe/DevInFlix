package devinflix.entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Filme extends Conteudo {

	private String url;
	

	public Filme(String titulo, Integer faixaEtaria) {
		super();
		this.titulo = titulo;
		this.faixaEtaria = faixaEtaria;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String getConteudo() {
		return this.titulo;
	}

	@Override
	public void comentar(String descricao, Usuario usuario) {
		Comentario comentario = new Comentario(descricao, usuario);
		this.comentarios.add(comentario);
		System.out.println("Comentário adicionado com sucesso!");
	}

	@Override
	public Set<Conteudo> removeConteudoImproprio(Set<Conteudo> listaConteudos) {
		List<Conteudo> lista = new ArrayList<Conteudo>(listaConteudos);

		for (Iterator<Conteudo> it = lista.iterator(); it.hasNext();) {
			Conteudo conteudo = it.next();
			if (conteudo.isImproprio()) {
				it.remove();
				System.out.println("Conteudo imprópio removido!");
			}
		}
		Set<Conteudo> listaNova = new HashSet<Conteudo>(lista);
		return listaNova;
	}

}
