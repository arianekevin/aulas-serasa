package testeBanco;

import java.time.LocalDate;

public class Funcionario implements AcessoInterno  {

	private final double INDICE = 0.05; //constante
	
	private String nome;
	private String cpf;
	private String ctps;
	private LocalDate dataAdmissao;
	private double salario;
	private String usuario;
	private String senha;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, String cpf, String ctps, LocalDate dataAdmissao, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nCTPS: " + getCtps() + 
				"\nData admissão: " + getDataAdmissao() + "\nSalário: " + getSalario();
	}
	
	/**
	 * Cálculo de bonus para todos os funcionários
	 * 
	 * @version 1.0
	 * @since 01/04/2022
	 * @author Ariane Casas
	 * @return valor calculado da bonificação
	 */
	
	public double getBonus() {
		return this.salario * INDICE;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissão(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean autenticarSistema(String usuario, String senha) {
		if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
			return true;
		}
		return false;
	}
	
	public String alterarUsuario(String usuarioAntigo, String senhaAntiga, String usuarioNovo) {
		if (validateSizeUserSenha(usuarioNovo, null)) {
			if (autenticarSistema(usuarioAntigo, senhaAntiga)) {
				this.usuario = usuarioNovo;
				return "Usuário alterado com sucesso!";
			} else {
				return "Usuário ou senha inválidos";
			}
		}
		return "Usuário precisa ter 12 caracteres ou menos";
	}
	
	public String alterarSenha(String usuarioAntigo, String senhaAntiga, String senhaNova) {
		if (validateSizeUserSenha(null, senhaNova)) {
			if (autenticarSistema(usuarioAntigo, senhaAntiga)) {
				this.senha = senhaNova;
				return "Senha alterada com sucesso!";
			} else {
				return "Usuário ou senha inválidos";
			}
		}
		return "Senha precisa ter 8 caracteres ou menos";
	}
	
	public boolean validateSizeUserSenha(String novoUsuario, String novaSenha) {
		if ((novoUsuario == null || novoUsuario.length() <= 12) && (novaSenha == null || novaSenha.length() <= 8)) {
			return true;
		}
		return false;
	}
	
	
	
}
