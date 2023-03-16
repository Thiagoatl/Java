import java.util.Scanner;

public class Exercicio2Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner leia = new Scanner(System.in);
		double reajuste;
		int salario, opcao;
		
		
		System.out.println("Qual o seu cargo?");
		System.out.println("1\t Gerente ");
		System.out.println("2\t Vendedor ");
		System.out.println("3\t Supervisor ");
		System.out.println("4\t Motorista ");
		System.out.println("5\t Estoquista ");
		System.out.println("6\t Técnico em Infomática");
		
		opcao = leia.nextInt();
		
		System.out.println("Digite o seu salario: ");
		salario = leia.nextInt();
		
		switch (opcao) {
		case 1:
			reajuste = (0.10);
			System.out.println("Seu novo salário é: " + (salario + (reajuste * salario)));
			break;
		case 3:
			reajuste = (0.07);
			System.out.println("Seu novo salá2rio é: " + (salario + (reajuste * salario)));
			break;
		case 4:
			reajuste = (0.09);
			System.out.println("Seu novo salá2rio é: " + (salario + (reajuste * salario)));
			break;
		case 5:
			reajuste = (0.06);
			System.out.println("Seu novo salá2rio é: " + (salario + (reajuste * salario)));
			break;
		case 6:
			reajuste = (0.08);
			System.out.println("Seu novo salá2rio é: " + (salario + (reajuste * salario)));
			break;
		}
	}
}
