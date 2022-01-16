package devinflix;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import devinflix.entidades.Conteudo;
import devinflix.entidades.Filme;
import devinflix.entidades.Usuario;
import devinflix.inicializadores.CatalogoInicializador;
import devinflix.inicializadores.UsuarioInicializador;

public class Plataforma {
	
	private Set<Conteudo> conteudos = CatalogoInicializador.inicializaCatalogo();
	private List<Usuario> usuarios = UsuarioInicializador.inicializaUsuarios();
	
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public Usuario getUsuarioLogado(Integer index) {
		Usuario usuarioLogado = this.usuarios.get(index);
		return usuarioLogado;
	}
	
	public Conteudo getConteudoPorId(Integer index) {
		List<Conteudo> conteudosList = new ArrayList<Conteudo>(this.conteudos);
		Conteudo conteudo = conteudosList.get(index);
		return conteudo;
	}

	public void sugerirConteudo(Conteudo conteudo, Usuario usuario){
		Set<Conteudo> conteudosSugeridos = usuario.getConteudoSugerido();
		for (Conteudo conteudoSugerido: conteudosSugeridos) {
			if(conteudoSugerido.equals(conteudo)) {
				System.out.println("Você já sugerio este filme!");
			}else {
				usuario.getConteudoSugerido().add(conteudo);
			}
		}
		//ChronoUnit.MONTHS.between(null, null);
	}
	
	public void curtirDescurtirFilme(Filme filme, Usuario usuario, boolean curtir) {
		if (curtir) {
			filme.setCurtidas(filme.getCurtidas() + 1);
		} else {
			filme.setDescurtidas(filme.getDescurtidas() + 1);
		}
	}
	
	// Usuário seleciona e assite um filme;
	public void selecionarConteudo(Filme filme, Usuario usuario) {
		usuario.setConteudoSelecionadoAtual(filme);
	}
		
	public static void main(String[] args) {
		Plataforma devinflix = new Plataforma();
		Usuario usuarioLogado = devinflix.getUsuarioLogado(0);
		
		
		
		//devinflix.sugerirConteudo(usuarioLogado, );
		
		System.out.println(usuarioLogado.toString());
		
	}
	
}
