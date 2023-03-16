import java.util.Scanner;

public class Exercicio1Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	Scanner leia = new Scanner(System.in);
	int opcao, preco, quantidade;
	float cq = 10, xs = 15, xb = 18, ba = 12, re = 8, sl = 13;
	
	System.out.println("\n\t\tProduto \t Preço   ");
	System.out.println("1\t Cachorro quente\t R$10,00");
	System.out.println("2\t X-Salada\t\t R$15,00");
	System.out.println("3\t X-Bacon\t\t R$18,00");
	System.out.println("4\t Bauru\t\t\t R$12,00");
	System.out.println("5\t Refrigerante\t\t R$8,00");
	System.out.println("6\t Suco de laranja\t R$13,00");
	System.out.println("-------------------------------------------");
	System.out.println("Qual produto deseja?");
	
	opcao = leia.nextInt();
	
	System.out.println("Digite a quantidade: ");
	quantidade = leia.nextInt();
	
	switch (opcao) {
	case 1:
		System.out.println("Você pediu " + quantidade + " Cachorro quente, dando um total de R$" + (quantidade * cq));
		break;
	case 2:
		System.out.println("Você pediu " + quantidade + " X-Salada, dando um total de R$" + (quantidade * xs));
		break;
	case 3:
		System.out.println("Você pediu " + quantidade + " X-Bacon, dando um total de R$" + (quantidade * xb));
		break;
	case 4:
		System.out.println("Você pediu " + quantidade + " Bauru, dando um total de R$" + (quantidade * ba));
		break;
	case 5:
		System.out.println("Você pediu " + quantidade + " Refrigerante, dando um total de R$" + (quantidade * re));
		break;
	case 6:
		System.out.println("Você pediu " + quantidade + " Suco de laranja, dando um total de R$" + (quantidade * sl));
		break;
	}
}
}