package testeBanco;

public class TestaBanco {

	public static void main(String[] args) {
		
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		conta1.setSaldo(300);
		conta1.setTitular("Ariane");
		
		System.out.println("Saldo inicial: R$" + conta1.getSaldo());
		
		conta1.depositar(100);
				
		System.out.println("Agencia: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getNumeroConta());
		System.out.println("Saldo após depósito: R$" + conta1.getSaldo());
		System.out.println("Titular: " + conta1.getTitular());
		
		double valorSacado = 2000;
		
		boolean sacado = conta1.sacar(valorSacado);;
		
		if (sacado) {
			System.out.println("Saldo após saque: " + conta1.getSaldo());
		} else {
			System.out.println("Não foi possível realizar o saque de R$ " + valorSacado +
					". O valor total de saldo é de R$" + conta1.getSaldo() + ". Verifique o valor do saldo.");
		}
		
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setNumeroConta(98564);
		conta2.setTitular("Flávia");
		
		conta1.transferir(100, conta2);
		
		System.out.printf("Saldo atual da conta1: R$ %.2f \n", conta1.getSaldo());
		System.out.printf("Saldo atual da conta2: R$ %.2f \n", conta2.getSaldo());
		
		}
	}