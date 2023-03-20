import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner leia = new Scanner(System.in);
			
			int numero;
			
			int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
			float[] vetorFloat = new float[9];
			
			System.out.println("Tamanho do vetor: " +  vetorFloat.length);
			
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			for (int contador = 0; contador < vetorInteiros.length; contador ++) {
				if (vetorInteiros[contador] == numero)	{
				    System.out.println("O numero " + vetorInteiros[contador] + " está na posição: [" + contador + "]");{
				    System.exit(0);}	
				    }
			}
			for (int contador = 0; contador < vetorInteiros.length; contador ++)
				if (numero != vetorInteiros[contador])	{
				    System.out.println("O numero " + numero + " não foi encontrado");
			System.exit(0);
			}
			
			
			
			leia.close();
		}

	}

