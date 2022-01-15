package devinflix.inicializadores;

import java.util.ArrayList;
import java.util.List;

import devinflix.entidades.Usuario;

public final class UsuarioInicializador {

	private UsuarioInicializador() {
	}

	public static List<Usuario> inicializaUsuarios() {

		Usuario usuario1 = new Usuario("Pedro");
		Usuario usuario2 = new Usuario("Maria");
		Usuario usuario3 = new Usuario("João");
		Usuario usuario4 = new Usuario("Luana");
		Usuario usuario5 = new Usuario("Anna");

		List<Usuario> usuarios = new ArrayList<Usuario>();

		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		usuarios.add(usuario5);

		return usuarios;
	}

}
