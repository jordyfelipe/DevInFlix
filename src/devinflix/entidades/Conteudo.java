package devinflix.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Conteudo implements Moderavel{

	protected String titulo;
	protected Genero genero;
	protected LocalDate anoLancamento;
	protected String sinopse;
	protected int curtidas;
	protected int descurtidas;
	protected boolean improprio;
	protected Integer faixaEtaria;
	protected List<Comentario> comentarios = new ArrayList<Comentario>();
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public LocalDate getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(LocalDate anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public int getDescurtidas() {
		return descurtidas;
	}

	public void setDescurtidas(int descurtidas) {
		this.descurtidas = descurtidas;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public boolean isImproprio() {
		return improprio;
	}
	
	public void setImproprio(boolean improprio) {
		this.improprio = improprio;
	}
	
	public Integer getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(Integer faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public abstract void comentar(String comentario, Usuario usuario);

	public abstract String getConteudo();
	
}
