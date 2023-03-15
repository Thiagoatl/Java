import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
	
	Scanner leia = new Scanner(System.in);
	float salariob, adcnot, hrs_ex, desc;
	
	System.out.println("Digite seu salário bruto:");
	salariob = leia.nextFloat();
	
	System.out.println("Digite o valor ganho em adicional noturno:");
	adcnot = leia.nextFloat();
	
	System.out.println("Digite o valor em horas extras:");
	hrs_ex = leia.nextFloat();
	
	System.out.println("Digite os descontos:");
	desc = leia.nextFloat();
	
	System.out.println("Seu salário liquido é: R$" + df.format(salariob + adcnot + (hrs_ex * 5) - desc));
}
}