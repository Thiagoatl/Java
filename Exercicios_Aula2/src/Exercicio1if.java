import java.util.Scanner;

public class Exercicio1if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int na, nb ,nc;
		
		System.out.println("Digite o valor de A: ");
		na = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		nb = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		nc = leia.nextInt();
		
		if ( (na + nb) > nc)
			System.out.println("A soma de A e B é maior que C");
		
		else if ( (na + nb) < nc)
			System.out.println("A soma de A e B é menor que C");
		
		else if ( (na + nb) == nc)
			System.out.println("A soma de A e B é igual que C");
		
		
		
	}

}
