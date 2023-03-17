import java.util.Scanner;

public class Exercicio6DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int num, soma = 0, contador = 0;
		float media;

		do {
		System.out.print("Diga um numero (0 para sair): ");
		num = input.nextInt();
			if (num != 0 && num % 3 == 0) {
				soma += num;
				contador++;
			}
		} while (num != 0);

		if (contador == 0) {
			System.out.println("Esses não são números múltiplos de 3.");
		} else {
			media = (float) soma / contador;
				System.out.printf("A média dos números múltiplos de 3 é %.2f.", media);
		}

	}
}