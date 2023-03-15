import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, diferença;
		System.out.println("Para descobrir a diferença entre a multiplicação do 1º com o 2º numero em comparação com a do 3º e 4º numero, digite os valores a seguir:");
		System.out.println("Digite o primeiro numero:");
		n1 = leia.nextFloat();
	
		System.out.println("Digite o segundo numero:");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro numero:");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto numero:");
		n4 = leia.nextFloat();
		
		
		diferença = (n1 * n2) - (n3 * n4);
		System.out.println("A multiplicação entre o 1º e 2º numero é: " + n1 * n2);
		System.out.println("A multiplicação entre o 3º e 4º numero é: " + n3 * n4);
		System.out.println("A difereça entre eles é: " + diferença);
		
		
		
	}

}
