package devinflix.entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Comentario implements Moderavel {

	private String descri��o;
	private Usuario usuario;
	private boolean improprio;

	public Comentario(String descri��o, Usuario usuario) {
		this.descri��o = descri��o;
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}

	public boolean isImproprio() {
		return improprio;
	}

	public void setImproprio(boolean improprio) {
		this.improprio = improprio;
	}

	@Override
	public Set<Conteudo> removeConteudoImproprio(Set<Conteudo> listaConteudos) {
		List<Conteudo> lista = new ArrayList<Conteudo>(listaConteudos);
		for (Conteudo conteudoLista : lista) {
			for (Iterator<Comentario> it = conteudoLista.comentarios.iterator();it.hasNext();) {
				Comentario comentario = it.next();
				if (comentario.isImproprio()) {
					it.remove();
					System.out.println("Coment�rio impr�pio removido!");
				}
			}
		}
		Set<Conteudo> listaNova = new HashSet<Conteudo>(lista);
		return listaNova;
	}

}
