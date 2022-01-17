package devinflix.entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Serie extends Conteudo {

	private int temporadas;
	private String url;

	public Serie(String titulo, Integer faixaEtaria) {
		super();
		this.titulo = titulo;
		this.faixaEtaria = faixaEtaria;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void listarEpisodios() {		
		for (Iterator<Episodio> it = this.getEpisodios().iterator(); it.hasNext();) {
			Episodio episodio = it.next();
				System.out.println(episodio.getTitulo()+" "+episodio.getDataLancamento()+".");
		}
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
