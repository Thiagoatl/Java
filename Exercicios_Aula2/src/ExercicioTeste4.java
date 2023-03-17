import java.util.Scanner;

public class ExercicioTeste4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner leia = new Scanner(System.in);
	        float saldo = 1000, saque, deposito;
	        int opcao;


	        System.out.println("Opções disponíveis: ");
	        System.out.println("-----------------------");
	        System.out.println("1\t Saldo");
	        System.out.println("2\t Saque");
	        System.out.println("3\t Deposito");
	        System.out.println("-----------------------");
	        System.out.println("Escolha a opção desejada: ");
	        opcao = leia.nextInt();

	        switch(opcao) {

	        case 1: 
	            System.out.println("Seu saldo atual é de: R$" + (saldo));
	            break;

	        case 2:
	            System.out.println("Saldo: R$" + (saldo));
	            System.out.println("Informe qual valor quer sacar");
	            saque = leia.nextFloat();{
	               if(saldo < saque)
	            System.out.println("Saldo insuficiente.");

	                 if (saldo >= saque)
	            System.out.println("Seu saldo atual é de: R$" + (saldo - saque));}


	}

	}
}