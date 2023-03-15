import java.text.DecimalFormat;
	import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		//Formatação da virgula
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		//Variaveis
		Scanner leia = new Scanner(System.in);
		float salario, abono, novosalario;
		//Digitar salario
		System.out.println("Digite o salario:");
		//Ler salario
		salario = leia.nextFloat();
		//Digitar abono
		System.out.println("Digite o abono:");
		//Ler abono
		abono = leia.nextFloat();
		//Somar Salario com Abono
		novosalario = (salario + abono);
		//Dar resultado final do novo salario
		System.out.println("Seu novo salário é: R$" + df.format(novosalario));
		}
		
}
