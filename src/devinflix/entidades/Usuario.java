package devinflix.entidades;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Usuario {

	private LocalDate dataNascimento;
	private String nome;
	private Integer idade;
	private String apelidoDevinflix;
	private String endereco;
	private boolean adimplente;
	private Conteudo conteudoSelecionado;
	private Set<Conteudo> conteudosSugeridos = new HashSet<Conteudo>();
	private Set<Conteudo> conteudosCurtidos = new HashSet<Conteudo>();
	private Set<Conteudo> conteudosDescurtidos = new HashSet<Conteudo>();

	public Usuario(String nome, String apelidoDevinflix, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.apelidoDevinflix = apelidoDevinflix;
	}

	public String getApelidoDevinflix() {
		return apelidoDevinflix;
	}

	public void setApelidoDevinflix(String apelidoDevinflix) {
		this.apelidoDevinflix = apelidoDevinflix;
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

	public Conteudo getConteudoSelecionado() {
		return conteudoSelecionado;
	}

	public void setConteudoSelecionado(Conteudo conteudoSelecionado) {
		this.conteudoSelecionado = conteudoSelecionado;
	}

	public Set<Conteudo> getConteudosSugeridos() {
		return conteudosSugeridos;
	}

	public void setConteudosSugeridos(Set<Conteudo> conteudosSugeridos) {
		this.conteudosSugeridos = conteudosSugeridos;
	}

	public void setConteudoSugerido(Conteudo conteudo) {
		this.conteudosSugeridos.add(conteudo);
	}

	public Set<Conteudo> getConteudosCurtidos() {
		return conteudosCurtidos;
	}

	public Set<Conteudo> getConteudosDescurtidos() {
		return conteudosDescurtidos;
	}

	public void setConteudosDescurtidos(Conteudo conteudo) {
		this.conteudosDescurtidos.add(conteudo);
	}

	public void setConteudosCurtidos(Conteudo conteudo) {
		this.conteudosCurtidos.add(conteudo);
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + "]";
	}

}
