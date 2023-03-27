import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
		Conta c1 = new Conta(1, 123, 1, "Thiagoatl", 100000.00f);
		c1.visualizar();
		
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Arnaldo", 100000.00f, 1000.00f);
		cc1.visualizar();
		
		cc1.sacar(100900);
		
		cc1.visualizar();
		
		cc1.depositar(2000);
		
		cc1.visualizar();
		
		ContaPoupanca cc2 = new ContaPoupanca(2, 123, 2, "Arnaldo", 100000.00f, 1000.00f);
		
		cc2.visualizar();
		
		cc2.depositar(2000);
		
		cc2.visualizar();

		while (true) {

			System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND
					+ "*************************************************");
			System.out.println("*\t\t\t\t\t\t*");
			System.out.println("*\t\t    ALTBank\t\t\t*");
			System.out.println("*\t\t\t\t\t\t*");
			System.out.println("*************************************************");
			System.out.println("*\t 1 - Criar Conta\t\t\t*");
			System.out.println("*\t 2 - Listar todas as contas\t\t*");
			System.out.println("*\t 3 - Buscar conta por numero\t\t*");
			System.out.println("*\t 4 - Atualizar Dados da Conta\t\t*");
			System.out.println("*\t 5 - Apagar Conta\t\t\t*");
			System.out.println("*\t 6 - Sacar\t\t\t\t*");
			System.out.println("*\t 7 - Depositar\t\t\t\t*");
			System.out.println("*\t 8 - Transferir valores entre contas\t*");
			System.out.println("*\t 9 - Sair\t\t\t\t*");
			System.out.println("*************************************************");
			System.out.println("Escolha a opção desejada:                        " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nALTbank - Depositou, ganhou!");
				leia.close();
				sobre();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1 -> {
				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca
				}
				}
			}
			case 2 -> {
				System.out.println("Digite o número da conta: ");
				aniversario = leia.nextInt();
			}

			case 3 -> {
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				// criar o objeto conta poupanca
			}
			case 4 -> {
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				tipo = 1;
				// condicional buscar na collection

				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				// retornar tipo

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca

				}
				default -> {
					System.out.println("Tipo de conta inválido!");
				}
				}

			}

			case 5 -> {
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
			}
			case 6 -> {
				System.out.println("Depósito\n\n ");
				
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				System.out.println("Digite o valor do saque: ");
				valor = leia.nextFloat();
			}
			case 7 -> {
				System.out.println("Depósito\n\n ");
				
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				System.out.println("Digite o valor do deposito: ");
				valor = leia.nextFloat();
			}
			case 8 -> {
				System.out.println("Digite o Numero da Conta de Origem: ");
				numero = leia.nextInt();
				System.out.println("Digite o Numero da Conta de Destino: ");
				numeroDestino = leia.nextInt();

				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = leia.nextFloat();
				} while (valor <= 0);
			}

			}
			
		}
	}
	public static void sobre() {
		System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_YELLOW + "**************************************************");
		System.out.println("Thiago Almeida Trevisani - thiagoatkl@gmail.com   ");
		System.out.println("https://github.com/Thiagoatl                      ");
		System.out.println("**************************************************");
}
	}
