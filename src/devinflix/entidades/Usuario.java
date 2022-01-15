package devinflix.entidades;

import java.time.LocalDate;
import java.util.LinkedList;

public class Usuario {

	private LocalDate dataNascimento;
	private String nome;
	private String endereco;
	private boolean adimplente;
	private LinkedList<Conteudo> conteudoSugerido = new LinkedList<Conteudo>();

	public Usuario(String nome) {
		super();
		this.nome = nome;
	}

	public LinkedList<Conteudo> getConteudoSugerido() {
		return conteudoSugerido;
	}

	public void setConteudoSugerido(LinkedList<Conteudo> conteudoSugerido) {
		this.conteudoSugerido = conteudoSugerido;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean isAdimplente() {
		return adimplente;
	}

	public void setAdimplente(boolean adimplente) {
		this.adimplente = adimplente;
	}
	
}
