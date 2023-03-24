package exercicio4;

public class testarfarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		farmacia c1 = new farmacia("Dipirona", 7.99 , "Carlos", "Droga", 3);
        farmacia c2 = new farmacia("Desodorante", 10.90 , "Jão", "Higiene", 2);
        farmacia c3 = new farmacia("Laka Oreo", 6.90 , "Roberto", "Perecivel", 2);
        
        
        System.out.println("\n--------------------------------\n");
        c1.visualizar();
        System.out.println("\n--------------------------------\n");
        c2.visualizar();
        System.out.println("\n--------------------------------\n");
        c3.visualizar();
        System.out.println("\n--------------------------------\n");
	}

	
}
