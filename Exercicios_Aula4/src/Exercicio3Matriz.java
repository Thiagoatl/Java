import java.util.Scanner;

public class Exercicio3Matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
		String diagonalPrincipal = "", diagonalSecundaria = "";

		for (int iLinha = 0; iLinha < matriz.length; iLinha++) {

			for (int iColuna = 0; iColuna < matriz.length; iColuna++) {

				System.out.println("Digite um número: ");
				matriz[iLinha][iColuna] = leia.nextInt();

			}
		}

		for (int contador = 0; contador < matriz.length; contador ++) {

			diagonalPrincipal += matriz[contador][contador] + " ";
			somaPrincipal += matriz[contador][contador];
			
			diagonalSecundaria += matriz[contador][matriz.length - 1 - contador] + " ";
			somaSecundaria += matriz[contador][matriz.length - 1 - contador];
		
		}
		
		System.out.println("Elementos da Diagonal Principal:\n");
		System.out.println(diagonalPrincipal);

		System.out.println("\n\nElementos da Diagonal Secundária:\n");
		System.out.println(diagonalSecundaria);

		System.out.println("\n\nSoma de todos Elementos da Diagonal Principal:\n");
		System.out.println(somaPrincipal);

		System.out.println("\n\nSoma de todos Elementos da Diagonal Secundária:\n");
		System.out.println(somaSecundaria);

		leia.close();
		
	}

}