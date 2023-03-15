import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner leia = new Scanner(System.in);
	float n1, n2, n3, n4, media;
	
	System.out.println("Digite a primeira nota:");
	n1 = leia.nextFloat();
	
	System.out.println("Digite a segunda nota:");
	n2 = leia.nextFloat();
	
	System.out.println("Digite a terceira nota:");
	n3 = leia.nextFloat();
	
	System.out.println("Digite a quarta nota:");
	n4 = leia.nextFloat();
	
	media= (n1 + n2 + n3 + n4) / 4;
	
	System.out.println("Sua média é: " + media);
}
}