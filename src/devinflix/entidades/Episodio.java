package devinflix.entidades;

import java.time.LocalDate;
import java.util.Comparator;

public class Episodio implements Comparator<Episodio>{

	private String titulo;
	private LocalDate dataLancamento;

	public Episodio(String titulo, LocalDate dataLancamento) {
		this.titulo = titulo;
		this.dataLancamento = dataLancamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	@Override
	public int compare(Episodio o1, Episodio o2) {
		return o1.dataLancamento.compareTo(o2.dataLancamento);
	}

}
