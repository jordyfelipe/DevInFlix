package devinflix.entidades;

public class Serie extends Conteudo {

	private int temporadas;

	public Serie(String titulo) {
		super();
	}
	
	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
	@Override
	public String getConteudo() {
		return this.titulo;
	}
	
}
