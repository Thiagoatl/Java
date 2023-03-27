package teste;

import funcionario.model.funcionario;
import funcionario.model.gerente;

public class testafuncionario {

	    public static void main(String[] args) {
	        funcionario f1 = new funcionario("João", 30, "Analista de Sistemas", 5000.50, true);
	        funcionario f2 = new funcionario("Maria", 25, "Programadora", 3500.50, false);
	        gerente g1 = new gerente("Marcos", 25, "Gerente", 6000.00, true, "Gerente");
	        
	        System.out.println("\n--------------------------------\n");
	        f1.visualizar();
	        System.out.println("\n--------------------------------\n");
	        f2.visualizar();
	        System.out.println("\n--------------------------------\n");
	        g1.visualizar();
	    }
	}

