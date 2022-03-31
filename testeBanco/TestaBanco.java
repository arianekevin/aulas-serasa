package testeBanco;

public class TestaBanco {

	public static void main(String[] args) {
		
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		conta1.setSaldo(300);
		
		PessoaFisica pfAriane = new PessoaFisica();
		pfAriane.setNome("Ariane");
		pfAriane.setEmail("ariane.kevin@gmail.com");
		pfAriane.setCpf("048.197.675-26");
		pfAriane.setProfissao("Desenvolvedora");
		pfAriane.setRg("7005123");
		
		
		conta1.setTitular(pfAriane);
		
		System.out.println("Saldo inicial: R$" + conta1.getSaldo());
		
		conta1.depositar(100);
				
		System.out.println("Agencia: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getNumeroConta());
		System.out.println("Saldo após depósito: R$" + conta1.getSaldo());
		System.out.println("Titular: " + conta1.getTitular());
		
		double valorSacado = 2000;
		
		boolean sacado = conta1.sacar(valorSacado);
		
		if (sacado) {
			System.out.println("Saldo após saque: " + conta1.getSaldo());
		} else {
			System.out.println("Não foi possível realizar o saque de R$ " + valorSacado +
					". O valor total de saldo é de R$" + conta1.getSaldo() + ". Verifique o valor do saldo.");
		}
		
		PessoaFisica pfFlavia = new PessoaFisica();
		pfFlavia.setNome("Flávia");
		pfFlavia.setEmail("flavia@gmail.com");
		pfFlavia.setCpf("888.888.888-88");
		pfFlavia.setProfissao("Professora");
		pfFlavia.setRg("8888888");
		
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setNumeroConta(98564);
		conta2.setTitular(pfFlavia);
		
		conta1.transferir(100, conta2);
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.depositar(1000);
		System.out.println("Saldo: " + cc1.getSaldo());
		System.out.println("Limite: " + cc1.getLimite());
		System.out.println("Saldo com limite: " + cc1.getSaldoComLimite());
		
		valorSacado = 350.0;
		
		cc1.sacar(valorSacado);
			
		System.out.println("Valor sacado: " + valorSacado);
		System.out.println("Saldo com limite: " + cc1.getSaldoComLimite());
				
		System.out.printf("Saldo atual da conta1: R$ %.2f \n", conta1.getSaldo());
		System.out.printf("Saldo atual da conta2: R$ %.2f \n", conta2.getSaldo());
		
		}
	}