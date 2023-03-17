import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1, n2;

		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();

		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();

		if (n1 >= n2) {
			System.out.println("Intervalo inválido!");
			
		}

		System.out.println("No intervalo entre " + n1 + " e " + n2 + ":");

		for (int multi = n1; multi <= n2; multi++) {
			if (multi % 3 == 0 && multi % 5 == 0) {
				System.out.println(multi + " É multiplo de 3 e 5");

			}
		}

	}
}