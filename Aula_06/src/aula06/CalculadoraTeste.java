package aula06;

import java.util.Scanner;

import Aula_06.calculos.Calculos;

public class CalculadoraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculos calc = new Calculos();
		Scanner leia = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("\nDigite a operação: ");
			System.out.println("-----------------------------------------");
			System.out.println("1\t Soma ");
			System.out.println("2\t Subtração ");
			System.out.println("3\t Multiplicação ");
			System.out.println("4\t Divisão");
			System.out.println("5\t Sobre");
			System.out.println("0\t Encerrar");
			System.out.println("-----------------------------------------");
			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("O Programa Foi Encerrado!");
				System.exit(0);
			}

			if (opcao >= 6) {
				System.out.println("Opção invalida!");
				continue;
			}
			
			if (opcao == 5) {
				sobre();
				continue;
			}

			System.out.println("Digite o primeiro número: ");
			double numero1 = leia.nextDouble();

			System.out.println("Digite o segundo número: ");
			double numero2 = leia.nextDouble();

			switch (opcao) {
			case 1 -> {
				System.out.println("\nSoma = " + calc.soma(numero1, numero2));
			}
			case 2 -> {
				System.out.println("\nSubtração = " + calc.subtracao(numero1, numero2));
			}

			case 3 -> {
				System.out.println("\nSubtração = " + calc.multiplicacao(numero1, numero2));
			}

			case 4 -> {
				System.out.println("\nSubtração = " + calc.divisao(numero1, numero2));
			}

			}
		}
	}

	public static void sobre() {
		System.out.println("Essa é a calculadora do Thiago <3");
	}
}