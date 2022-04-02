package testeBanco;

public class ContaCorrente extends Conta {
	
	private double limite;
	
	public ContaCorrente() {
		this.limite = 500.0;
	}
	@Override
	public boolean sacar(double valor) {
		if (valor >= 0 && getSaldoComLimite() >= valor) {
			saldo -= valor;
			return true;
		}
		
		return false;
		
	}
	
	@Override
	public boolean transferir(double valor, Conta destinatarioConta) {
		
		if (valor >= 0 && getSaldoComLimite() >= valor) {
			saldo -= valor;
			destinatarioConta.depositar(valor);
			return true;
		}
		
		return false;
		
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	
	
	//métodos Getters and Setters

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldoComLimite() {
		return saldo + limite;
	}	
	
}
