package testeBanco;

public class Conta {
	//atributos
	private int agencia;
	private int numeroConta;
	protected double saldo;
	private PessoaHeranca titular;
	
	
	public Conta() { //padrão
		
	}
	
	
	public Conta(int agencia, int numeroConta, PessoaHeranca titular) { //sobrecarregado
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0;
	}
	
	//metodos
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	public boolean sacar(double valor) {
		if (saldo > 0 && saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, Conta destinatarioConta) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			destinatarioConta.depositar(valor);
			return true;
		}
		return false;
	}
	
	
	//métodos Getters and Setters

	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public PessoaHeranca getTitular() {
		return titular;
	}


	public void setTitular(PessoaHeranca titular) {
		this.titular = titular;
	}
	
	
	
}
