import java.util.Scanner;

public class Exercicio2if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		int idade;
		String nome;
		boolean apto = false;
		char doacao;
		//setar valores
		
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? (Responda com s ou n)");
		leia.skip("\\R?");
		doacao = leia.nextLine().charAt(0);
			
		//condições
		
		if (doacao=='s')
		apto = true;
        
	if (idade >= 60 && idade <= 69) {
		if(apto)
			System.out.println(nome + " não está Apto para doar sangue!");
		else
			System.out.println(nome + " está apto a doar sangue!");
	}
	else if (idade < 18 || idade > 69)
		System.out.println(nome + " não está Apto para doar sangue!");
	else
		System.out.println(nome + " está Apto para doar sangue!");
	
		
		
		
		

	}

}
