import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1EstruturaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila = new LinkedList<>();
		Scanner leia = new Scanner(System.in);

		int opcao;
		do {
			System.out.println("Menu:");
			System.out.println("*****************************************");
			System.out.println("*1 - Adicionar novo cliente na fila\t*");
			System.out.println("*2 - Listar todos os clientes na fila\t*");
			System.out.println("*3 - Chamar (retirar) um cliente da fila*");
			System.out.println("*0 - Sair\t\t\t\t*");
			System.out.println("*****************************************");

			System.out.print("\nDigite uma opção: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("\nDigite o nome do cliente: ");
				String nome = leia.next();
				fila.add(nome);
				System.out.println("\nFila:\n" + fila + "\nCliente adicionado!");
				break;
			case 2:
				System.out.println("\nLista de clientes na fila:\n" + fila);
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					String clienteChamado = fila.remove();
					System.out.println("\nFila:\n" + fila + "\nO cliente " + clienteChamado + " foi chamado!");
				}
				break;
			case 0:
				System.out.println("\nPrograma finalizado!");
				break;
			default:
				System.out.println("\nOpção inválida! Tente novamente.");
				break;
			}
			System.out.println();
		} while (opcao != 0);

		leia.close();
	}

}
