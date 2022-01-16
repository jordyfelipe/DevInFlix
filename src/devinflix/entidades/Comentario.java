package devinflix.entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Comentario implements Moderavel {

	private String descrição;
	private Usuario usuario;
	private boolean improprio;

	public Comentario(String descrição, Usuario usuario) {
		this.descrição = descrição;
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
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
					System.out.println("Comentário imprópio removido!");
				}
			}
		}
		Set<Conteudo> listaNova = new HashSet<Conteudo>(lista);
		return listaNova;
	}

}
