import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		//Variaveis
		Scanner leia = new Scanner(System.in);
		float salario, abono, novosalario;
		
		//Digitar Salário
		System.out.println("Digite o salário: ");
		//Ler Salário
		salario = leia.nextFloat();
		//Digitar Abono
		System.out.println("Digite o abono: ");
		//Ler Abono
		abono = leia.nextFloat();
		//Descobrir novo salario
		novosalario = (salario + abono);
		//Resultado final novo salário
		System.out.println("O novo salário é: R$" + df.format(novosalario));
		
	}

}
