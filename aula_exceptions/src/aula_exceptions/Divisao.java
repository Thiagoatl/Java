package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;

		do {
			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = ler.nextInt();

				System.out.println("Digite o Divisor: ");
				divisor = ler.nextInt();

				loop = false;

				divide(dividendo, divisor);
			} catch (InputMismatchException e) {
				System.err.println("Digite um numero inteiro!");
				ler.nextLine();
			} catch (ArithmeticException e) {
				System.err.println("Não existe divisão por 0");
				ler.nextLine();
			}
			finally {
				System.out.println("Sempre serei executada!");
			}

		} while (loop);
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
