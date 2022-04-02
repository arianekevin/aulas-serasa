package testeBanco;

import java.time.LocalDate;

public class Gerente extends Funcionario {
	
	private final double INDICE = 0.1;
	
	public Gerente() {
		
	}
	
	public Gerente(String nome, String cpf, String ctps, LocalDate dataAdmissao, double salario) {
		super(nome, cpf, ctps, dataAdmissao, salario);
	}
		
	@Override
	public double getBonus() {
		return this.getSalario() * INDICE;
	}
	
	
}
