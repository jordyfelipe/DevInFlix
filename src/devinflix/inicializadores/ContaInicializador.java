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
		Usuario usuario1 = new Usuario("Pedro","Pedro13");
		Usuario usuario2 = new Usuario("Maria","Maria_Luiza");
		

		Conta conta2 = new Conta("familia_Tavares", "123", "Cartão de Crédito");
		Set<Usuario> usuarios2 = new HashSet<Usuario>();
		Usuario usuario4 = new Usuario("Luana","Luana.lulu");
		Usuario usuario5 = new Usuario("Anna","AnnaS2");
		Usuario usuario6 = new Usuario("Luiz","Luiz_Henrique03");
		
		//Conta conta3 = new Conta("familia_Tavares", "123", "Cartão de Crédito");
				
		//Conta conta4 = new Conta("familia_Tavares", "123", "Cartão de Crédito");
		
		//Conta conta5 = new Conta("familia_Tavares", "123", "Cartão de Crédito");
		
		usuarios1.add(usuario1);
		usuarios1.add(usuario2);
		
		usuarios2.add(usuario4);
		usuarios2.add(usuario5);
		usuarios2.add(usuario6);
	
		conta1.setUsuariosVinculados(usuarios1);
		conta2.setUsuariosVinculados(usuarios2);
			
		Set<Conta> contas = new HashSet<Conta>();
		contas.add(conta1);
		contas.add(conta2);

		return contas;
	}

}
