package devinflix.entidades;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Usuario {

	private LocalDate dataNascimento;
	private String nome;
	private String endereco;
	private boolean adimplente;
	private Conteudo conteudoSelecionado;
	private Set<Conteudo> conteudoSugerido = new HashSet<Conteudo>();
	

	public Usuario(String nome) {
		super();
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoSugerido() {
		return conteudoSugerido;
	}

	public void setConteudoSugerido(Set<Conteudo> conteudoSugerido) {
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

	public Conteudo getConteudoSelecionadoAtual() {
		return conteudoSelecionado;
	}

	public void setConteudoSelecionadoAtual(Conteudo conteudoSelecionadoAtual) {
		this.conteudoSelecionado = conteudoSelecionadoAtual;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + "]";
	}

}
