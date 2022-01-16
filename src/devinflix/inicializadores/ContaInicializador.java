package devinflix.inicializadores;

import java.util.HashSet;
import java.util.Set;

import devinflix.entidades.Conta;
import devinflix.entidades.Usuario;

public final class ContaInicializador {

	private ContaInicializador() {
	}

	public static Set<Conta> inicializaContas() {

		Conta conta1 = new Conta("familia_silva", "123", "Cartão de Crédito");
		Set<Usuario> usuarios1 = new HashSet<Usuario>();
		Usuario usuario1 = new Usuario("Pedro", "Pedro13");
		Usuario usuario2 = new Usuario("Maria", "Maria_Luiza");

		Conta conta2 = new Conta("familia_Tavares", "123", "Cartão de Crédito");
		Set<Usuario> usuarios2 = new HashSet<Usuario>();
		Usuario usuario4 = new Usuario("Luana", "Luana.lulu");
		Usuario usuario5 = new Usuario("Anna", "AnnaS2");
		Usuario usuario6 = new Usuario("Luiz", "Luiz_Henrique03");

		Conta conta3 = new Conta("familia_Costa", "123", "Cartão de Crédito");
		Set<Usuario> usuarios3 = new HashSet<Usuario>();
		Usuario usuario7 = new Usuario("Matheus", "MatheusZ");
		Usuario usuario8 = new Usuario("Marcia", "Mahh");

		Conta conta4 = new Conta("familia_Ferreira", "123", "Cartão de Crédito");
		Set<Usuario> usuarios4 = new HashSet<Usuario>();
		Usuario usuario9 = new Usuario("Lilian", "Lili");

		Conta conta5 = new Conta("familia_Santos", "123", "Cartão de Crédito");
		Set<Usuario> usuarios5 = new HashSet<Usuario>();
		Usuario usuario10 = new Usuario("Arthur", "Arthur_S");

		usuarios1.add(usuario1);
		usuarios1.add(usuario2);

		usuarios2.add(usuario4);
		usuarios2.add(usuario5);
		usuarios2.add(usuario6);
		
		usuarios3.add(usuario7);
		usuarios3.add(usuario8);
		
		usuarios4.add(usuario9);
		
		usuarios5.add(usuario10);

		conta1.setUsuariosVinculados(usuarios1);
		conta2.setUsuariosVinculados(usuarios2);
		conta3.setUsuariosVinculados(usuarios3);
		conta4.setUsuariosVinculados(usuarios4);
		conta5.setUsuariosVinculados(usuarios5);

		Set<Conta> contas = new HashSet<Conta>();
		contas.add(conta1);
		contas.add(conta2);

		return contas;
	}

}
