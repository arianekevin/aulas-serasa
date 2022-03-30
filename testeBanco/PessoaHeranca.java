package testeBanco;

public class PessoaHeranca {
	String nome;
	String email;
	String telefone;
	
	public PessoaHeranca() {
		
	}
	
	public PessoaHeranca(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}