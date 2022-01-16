package devinflix;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import devinflix.entidades.Conta;
import devinflix.entidades.Conteudo;
import devinflix.entidades.Filme;
import devinflix.entidades.Usuario;
import devinflix.inicializadores.CatalogoInicializador;
import devinflix.inicializadores.ContaInicializador;

public class Plataforma {

	private Set<Conteudo> conteudos = CatalogoInicializador.inicializaCatalogo();
	private Set<Conta> contas = ContaInicializador.inicializaContas();

	public void setUsuarioConta(Usuario usuario, Conta conta) {
		if (conta.getUsuariosVinculados().size() < 3) {
			conta.getUsuariosVinculados().add(usuario);
			System.out.println("Usuário incluído com sucesso!");
		} else {
			System.out.println("Máximo de usuários por conta já atingido!");
		}
	}

	public Set<Conta> getContas() {
		return contas;
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
		System.out.println("Conteúdo sugerido com sucesso!");

		// ChronoUnit.MONTHS.between(null, null);
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

		// Usuario usuario1 = new Usuario("Gabriela","Gabi");
		// devinflix.setUsuarioConta(usuario1, devinflix.getContaPorId(0));

		// devinflix.sugerirConteudo(devinflix.getConteudoPorId(0),
		// devinflix.getContaPorId(0).getUsuarioPorId(0));

		/*
		 * List<Conta> contas = new ArrayList<Conta>(devinflix.getContas()); for
		 * (Usuario usuario : contas.get(0).getUsuariosVinculados()) {
		 * System.out.println(usuario.toString()); }
		 */
		
		devinflix.getConteudoPorId(0).comentar("Filme muito bom!", devinflix.getContaPorId(0).getUsuarioPorId(0));
		System.out.println(devinflix.getConteudoPorId(0).getComentarios().get(0));

	}

}
