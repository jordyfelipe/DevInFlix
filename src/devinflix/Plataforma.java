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
		Set<Conteudo> conteudosSugeridos = usuario.getConteudosSugeridos();
		for (Conteudo conteudoSugerido: conteudosSugeridos) {
			if(conteudoSugerido.equals(conteudo)) {
				System.out.println("Você já sugerio este filme!");
			}else {
				usuario.getConteudosSugeridos().add(conteudo);
			}
		}
		//ChronoUnit.MONTHS.between(null, null);
	}
	
	public void curtirDescurtirConteudo(Conteudo conteudo, Usuario usuario, boolean curtir) {
		if (curtir) {
			conteudo.setCurtidas(conteudo.getCurtidas() + 1);
			usuario.setConteudosCurtidos(conteudo);
		} else {
			conteudo.setDescurtidas(conteudo.getDescurtidas() + 1);
			usuario.setConteudosDescurtidos(conteudo);
		}
	}
	
	// Usuário seleciona e assite um filme;
	public void selecionarConteudo(Filme filme, Usuario usuario) {
		usuario.setConteudoSelecionado(filme);
	}
		
	public static void main(String[] args) {
		Plataforma devinflix = new Plataforma();
		Usuario usuarioLogado = devinflix.getUsuarioLogado(0);
		
		
		
		//devinflix.sugerirConteudo(usuarioLogado, );
		
		System.out.println(usuarioLogado.toString());
		
	}
	
}
