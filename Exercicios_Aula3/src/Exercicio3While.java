import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int idade, menor21 = 0, maior50 = 0, entre = 0;

		while (true) {
			System.out.print("Diga a idade (ou um numero negativo para encerrar): ");
			idade = leia.nextInt();

			if (idade < 0) {
				break;
			}

			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			} else
				entre++;

		}

		System.out.println("Total de pessoas com idade menor que 21 anos: " + menor21);
		System.out.println("Total de pessoas com idade entre 21 e 50 anos: " + entre);
		System.out.println("Total de pessoas com idade maior que 50 anos: " + maior50);
	}
}