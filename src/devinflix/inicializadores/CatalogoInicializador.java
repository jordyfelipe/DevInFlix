package devinflix.inicializadores;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import devinflix.entidades.Conteudo;
import devinflix.entidades.Episodio;
import devinflix.entidades.Filme;
import devinflix.entidades.Serie;

public final class CatalogoInicializador {

	private CatalogoInicializador() {

	}

	public static Set<Conteudo> inicializaCatalogo() {

		Conteudo conteudo0 = new Filme("Homem aranha",10);
		Conteudo conteudo1 = new Filme("Não Olhe para Cima",18);
		Conteudo conteudo2 = new Filme("Batman",10);
		Conteudo conteudo3 = new Filme("Matrix",16);
		Conteudo conteudo4 = new Filme("Harry Potter",0);
		Conteudo conteudo5 = new Filme("Hulk",10);
		
		Conteudo conteudo6 = new Serie("The Walking Dead",18);
		Conteudo conteudo7 = new Serie("Round 6",18);
		Conteudo conteudo8 = new Serie("The 100",18);
		Conteudo conteudo9 = new Serie("La Casa de Papel",18);
		
		Episodio episodio1 = new Episodio("1º Episódio",LocalDate.of(2022, 01, 16));
		Episodio episodio2 = new Episodio("2º Episódio",LocalDate.of(2022, 02, 13));
		Episodio episodio3 = new Episodio("3º Episódio",LocalDate.of(2022, 02, 28));
		
		List<Episodio> episodios = new ArrayList<Episodio>();
		episodios.add(episodio1);
		episodios.add(episodio2);
		episodios.add(episodio3);
		
		 ((Serie) conteudo7).setEpisodios(episodios);

		Set<Conteudo> conteudos = new HashSet<Conteudo>();
		
		conteudos.add(conteudo0);
		conteudos.add(conteudo1);
		conteudos.add(conteudo2);
		conteudos.add(conteudo3);
		conteudos.add(conteudo4);
		conteudos.add(conteudo5);
		conteudos.add(conteudo6);
		conteudos.add(conteudo7);
		conteudos.add(conteudo8);
		conteudos.add(conteudo9);

		return conteudos;

	}
}
