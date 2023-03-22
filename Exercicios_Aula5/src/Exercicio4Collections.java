import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<>();

		System.out.print("Digite a quantidade de números que deseja adicionar: ");
		int quantidade = leia.nextInt();

		System.out.print("Digite os números que deseja adicionar: ");
		for (int cont = 0; cont < quantidade; cont++) {
			numeros.add(leia.nextInt());
			System.out.println(numeros);
		}

		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroProcurado = leia.nextInt();

		if (numeros.contains(numeroProcurado)) {
			System.out.println("O número " + numeroProcurado + " foi encontrado!");
		} else {
			System.out.println("O número " + numeroProcurado + " não foi encontrado!");
		}

	}

}
