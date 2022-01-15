package devinflix;

import java.util.List;
import java.util.Set;

import devinflix.entidades.Conteudo;
import devinflix.entidades.Filme;
import devinflix.entidades.Usuario;
import devinflix.inicializadores.CatalogoInicializador;
import devinflix.inicializadores.UsuarioInicializador;

public class Plataforma {
	
	
	Set<Conteudo> conteudos = CatalogoInicializador.inicializaCatalogo();
	List<Usuario> usuarios = UsuarioInicializador.inicializaUsuarios();
	
	public void indicaConteudo(Conteudo conteudo, Usuario usuario){
		
		//ChronoUnit.MONTHS.between(null, null);
	}
	
	public void curtirDescurtirFilme(Filme filme, Usuario usuario, boolean curtir) {
		if (curtir) {
			filme.setCurtidas(filme.getCurtidas() + 1);
		} else {
			filme.setDescurtidas(filme.getDescurtidas() + 1);
		}
	}
	
	public void selecionaFilme(Filme filme, Usuario usuario) {
		// Usuário seleciona e assite um filme;
	}
		
	public static void main(String[] args) {
		//Plataforma devinflix = new Plataforma();
		
		
	}
	
}
