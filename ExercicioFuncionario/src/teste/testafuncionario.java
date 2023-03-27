package teste;

import funcionario.model.funcionario;
import funcionario.model.gerente;
import funcionario.model.vendedor;

public class testafuncionario {

	    public static void main(String[] args) {
	        funcionario f1 = new funcionario("João", 30, "Analista de Sistemas", 5000.50, true);
	        funcionario f2 = new funcionario("Maria", 25, "Programadora", 3500.50, false);
	        gerente g1 = new gerente("Marcos", 25, "Gerente", 6000.00, true, "Gerente");
	        vendedor v1 = new vendedor("Roberto", 29, "Vendedor", 3000.00, true, true);
	        
	        System.out.println("\n--------------------------------\n");
	        f1.visualizar();
	        System.out.println("\n--------------------------------\n");
	        f2.visualizar();
	        System.out.println("\n--------------------------------\n");
	        g1.visualizar();
	        System.out.println("\n--------------------------------\n");
	        v1.visualizar();
	    }
	}

