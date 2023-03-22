import java.util.Scanner;
import java.util.Stack;

public class Exercicios2EstruturaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Stack<String> livros = new Stack<String>();
	        Scanner leia = new Scanner(System.in);
	        
	        int opcao = -1;
	        while (opcao != 0) {
	        	System.out.println("---------------------------------------");
	        	System.out.println("|Menu:\t\t\t\t      |");
	            System.out.println("| 1: Adicionar um novo livro na pilha |");
	            System.out.println("| 2: Listar todos os livros da Pilha  |");
	            System.out.println("| 3: Retirar um livro da pilha\t      |");
	            System.out.println("| 0: O programa deve ser finalizado.  |");
	            System.out.println("---------------------------------------");
	            System.out.print("\nDigite uma opção: ");
	            opcao = leia.nextInt();
	            leia.nextLine();
	            
	            switch (opcao) {
	                case 1:
	                    System.out.print("\nDigite o nome: ");
	                    String nome = leia.nextLine();
	                    livros.push(nome);
	                    System.out.println("\nPilha:");
	                    for (String livro : livros) {
	                        System.out.println(livro);
	                    }
	                    System.out.println("\nLivro adicionado!");
	                    break;
	                case 2:
	                    System.out.println("\nLista de Livros na Pilha:");
	                    for (String livro : livros) {
	                        System.out.println(livro);
	                    }
	                    break;
	                case 3:
	                    if (livros.empty()) {
	                        System.out.println("\nA Pilha está vazia!");
	                    } else {
	                        livros.pop();
	                        System.out.println("\nPilha:");
	                        for (String livro : livros) {
	                            System.out.println(livro);
	                        }
	                        System.out.println("\nUm Livro foi retirado da pilha!");
	                    }
	                    break;
	                case 0:
	                    System.out.println("\nPrograma Finalizado!");
	                    break;
	                default:
	                    System.out.println("\nOpção inválida!");
	            }
	        }
	        
	        leia.close();
		
	}

}
