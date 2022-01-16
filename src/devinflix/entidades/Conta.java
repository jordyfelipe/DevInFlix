package devinflix.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Conta {

	private String email;
	private String senha;
	private String formaPagamento;
	private Set<Usuario> usuariosVinculados;

	public Conta(String email, String senha, String formaPagamento) {
		super();
		this.email = email;
		this.senha = senha;
		this.formaPagamento = formaPagamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Set<Usuario> getUsuariosVinculados() {
		return usuariosVinculados;
	}
	
	public void setUsuariosVinculados(Set<Usuario> usuariosVinculados) {
		this.usuariosVinculados = usuariosVinculados;
	}

	public void setUsuariosVinculados(Usuario usuario) {
		this.usuariosVinculados.add(usuario);
	}
	
	public Usuario getUsuarioPorId(Integer index) {
		List<Usuario> usuarios = new ArrayList<Usuario>(this.usuariosVinculados);
		return usuarios.get(index);
	}
	
}
