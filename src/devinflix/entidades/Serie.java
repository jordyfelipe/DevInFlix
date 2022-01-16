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

	@Override
	public void comentar(String comentario, Usuario usuario) {
		this.comentarios.add(comentario + " Autor: " + usuario);
		System.out.println("Comentário adicionado com sucesso!");
	}

}
