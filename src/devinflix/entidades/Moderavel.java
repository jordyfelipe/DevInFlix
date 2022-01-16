package devinflix.entidades;

import java.util.Set;

public interface Moderavel {
	
	public abstract Set<Conteudo> removeConteudoImproprio(Set<Conteudo> listaConteudos);
	
}
