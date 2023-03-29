package aula_exceptions;

public class TestaExcecaoSimples {

	public static void main(String[] args) {

		String nomes[] = { "João", "Maria", "Pedro", "Manuela" };

		try {
			for (int i = 0; i < nomes.length; i++) {
				System.out.println(nomes[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("\nExceção: " + e);
			System.out.println("\nPosição Inválida");
		}
		
	}

}
