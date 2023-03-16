import java.util.Scanner;

public class PlanoSaudeV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  leia = new Scanner (System.in);

        int faixa;

        System.out.println("Faixas Etárias");
        System.out.println("1\taté 10 anos");
        System.out.println("2\tde 11 a 29 anos");
        System.out.println("3\tde 30 a 45 anos");
        System.out.println("4\tde 46 a 59 anos");
        System.out.println("5\tde 60 a 65 anos");
        System.out.println("6\tacima de 65 anos\n\n");

        System.out.println("Digite a faixa etária: ");
        faixa = leia.nextInt();

        switch(faixa) {

        case 1:
            System.out.println("O valor do Plano é de R$ 100,00");
            break;
        case 2:
            System.out.println("O valor do Plano é de R$ 200,00");
            break;
        case 3:
            System.out.println("O valor do Plano é de R$ 300,00");
            break;
        case 4:
            System.out.println("O valor do Plano é de R$ 500,00");
            break;
        case 5:
            System.out.println("O valor do Plano é de R$ 600,00");
            break;
        case 6:
            System.out.println("O valor do Plano é de R$ 1000,00");
            break;
        }
		
		
		
		
	}

}
