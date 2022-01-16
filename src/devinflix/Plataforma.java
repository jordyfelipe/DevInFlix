package devinflix;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import devinflix.entidades.Conta;
import devinflix.entidades.Conteudo;
import devinflix.entidades.Usuario;
import devinflix.inicializadores.CatalogoInicializador;
import devinflix.inicializadores.ContaInicializador;

public class Plataforma {

	private Set<Conteudo> conteudos = CatalogoInicializador.inicializaCatalogo();
	private Set<Conta> contas = ContaInicializador.inicializaContas();

	public void setUsuarioConta(Usuario usuario, Conta conta) {
		if (conta.getUsuariosVinculados().size() < 3) {
			conta.getUsuariosVinculados().add(usuario);
			System.out.println("Usu�rio inclu�do com sucesso!");
		} else {
			System.out.println("M�ximo de usu�rios por conta j� atingido!");
		}
	}

	public Set<Conta> getContas() {
		return contas;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	public Conta getContaPorId(Integer index) {
		List<Conta> contas = new ArrayList<Conta>(this.contas);
		return contas.get(index);
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public Conteudo getConteudoPorId(Integer index) {
		List<Conteudo> conteudosList = new ArrayList<Conteudo>(this.conteudos);
		Conteudo conteudo = conteudosList.get(index);
		return conteudo;
	}

	public void sugerirConteudo(Conteudo conteudo, Usuario usuario) {

		usuario.setConteudoSugerido(conteudo);
		System.out.println(conteudo.getTitulo() + " sugerido com sucesso!");

		// ChronoUnit.MONTHS.between(null, null);
	}

	public void curtirDescurtirConteudo(Conteudo conteudo, Usuario usuario, boolean curtir) {
		if (curtir) {
			conteudo.setCurtidas(conteudo.getCurtidas() + 1);
			usuario.setConteudosCurtidos(conteudo);
			System.out.println("Conte�do: " + conteudo.getTitulo() + " curtido!");
		} else {
			conteudo.setDescurtidas(conteudo.getDescurtidas() + 1);
			usuario.setConteudosDescurtidos(conteudo);
		}
	}

	// Usu�rio seleciona e assite um filme;
	public void selecionarConteudo(Conteudo conteudo, Usuario usuario) {
		if(conteudo.getFaixaEtaria()<=usuario.getIdade()) {
			usuario.setConteudoSelecionado(conteudo);
			System.out.println("Conte�do selecionado");
		}else {
			System.out.println("infelizmente, o conte�do � impr�prio para sua idade "+usuario.getNome());
		}
		
	}

	public static void main(String[] args) {
		Plataforma devinflix = new Plataforma();
		
		// Adiciona novo perfil a conta
		Usuario usuario1 = new Usuario("Joana", "Joaninha",18);
		devinflix.setUsuarioConta(usuario1, devinflix.getContaPorId(1));
		
		// Conta 1 sugeriu um filme
		devinflix.sugerirConteudo(devinflix.getConteudoPorId(1), devinflix.getContaPorId(1).getUsuarioPorId(1));
		
		// Conta 2 sugeriu uma s�rie
		devinflix.sugerirConteudo(devinflix.getConteudoPorId(0), devinflix.getContaPorId(0).getUsuarioPorId(0));

		// Conta 2 comentou uma serie
		devinflix.getConteudoPorId(0).comentar("S�rie muito boa! Recomendo!",
				devinflix.getContaPorId(0).getUsuarioPorId(0));

		// Mostra coment�rio
		System.out.println("Coment�rio adicionado ao conte�do \"" + devinflix.getConteudoPorId(0).getTitulo() + "\": "
				+ devinflix.getConteudoPorId(0).getComentarios().get(0).getDescri��o() + " Autor: "
				+ devinflix.getConteudoPorId(0).getComentarios().get(0).getUsuario().getNome());

		devinflix.curtirDescurtirConteudo(devinflix.getConteudoPorId(0), devinflix.getContaPorId(0).getUsuarioPorId(0),
				true);
		devinflix.curtirDescurtirConteudo(devinflix.getConteudoPorId(1), devinflix.getContaPorId(1).getUsuarioPorId(1),
				true);

		// Pega um conteudo impr�prio
		// devinflix.getConteudoPorId(0).setConteudoImproprio(devinflix.getConteudos(),
		// devinflix.getConteudoPorId(0));

		// Classifica um comentario como impr�prio
		devinflix.getConteudoPorId(0).getComentarios().get(0).setImproprio(true);
		// Remove um coment�rio impr�prio
		devinflix.setConteudos(devinflix.getConteudoPorId(0).getComentarios().get(0)
				.removeConteudoImproprio(devinflix.getConteudos()));

		// Classifica um conte�do como impr�prio
		devinflix.getConteudoPorId(0).setImproprio(true);
		// Remove um conte�do impr�prio
		devinflix.setConteudos(devinflix.getConteudoPorId(0)
				.removeConteudoImproprio(devinflix.getConteudos()));
		
		//Teste Restri��o et�ria
		devinflix.selecionarConteudo(devinflix.getConteudoPorId(0), devinflix.getContaPorId(0).getUsuarioPorId(0));

	}

}
