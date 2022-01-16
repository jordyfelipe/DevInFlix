package devinflix.inicializadores;

import java.util.HashSet;
import java.util.Set;

import devinflix.entidades.Conteudo;
import devinflix.entidades.Filme;
import devinflix.entidades.Serie;

public final class CatalogoInicializador {

	private CatalogoInicializador() {

	}

	public static Set<Conteudo> inicializaCatalogo() {

		Conteudo conteudo1 = new Filme("Homem aranha",10);
		Conteudo conteudo2 = new Filme("Não Olhe para Cima",18);
		Conteudo conteudo3 = new Filme("Batman",10);
		Conteudo conteudo4 = new Filme("Matrix",16);
		Conteudo conteudo5 = new Filme("Harry Potter",0);
		Conteudo conteudo6 = new Filme("Hulk",10);
		Conteudo conteudo7 = new Serie("The Walking Dead",18);
		Conteudo conteudo8 = new Serie("Round 6",18);
		Conteudo conteudo9 = new Serie("The 100",18);
		Conteudo conteudo10 = new Serie("La Casa de Papel",18);

		Set<Conteudo> conteudos = new HashSet<Conteudo>();

		conteudos.add(conteudo1);
		conteudos.add(conteudo2);
		conteudos.add(conteudo3);
		conteudos.add(conteudo4);
		conteudos.add(conteudo5);
		conteudos.add(conteudo6);
		conteudos.add(conteudo7);
		conteudos.add(conteudo8);
		conteudos.add(conteudo9);
		conteudos.add(conteudo10);

		return conteudos;

	}
}
