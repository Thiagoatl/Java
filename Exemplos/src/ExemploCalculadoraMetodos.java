import java.util.Scanner;

public class ExemploCalculadoraMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = leia.nextDouble();
        int opcao;
        System.out.print("Digite o segundo número: ");
        double num2 = leia.nextDouble();

        System.out.println("\nDigite a operação: ");
        System.out.println("-----------------------------------------");
        System.out.println("1\t Soma ");
        System.out.println("2\t Subtração ");
        System.out.println("3\t Multiplicação ");
        System.out.println("4\t Divisão");
        System.out.println("-----------------------------------------");
        opcao = leia.nextInt();

        double result = 0.0;

        switch (opcao) {
            case 1 :
                result = calculate(num1, num2, (a, b) -> a + b);
                break;
            case 2 :
                result = calculate(num1, num2, (a, b) -> a - b);
                break;
            case 3 :
                result = calculate(num1, num2, (a, b) -> a * b);
                break;
            case 4 :
                result = calculate(num1, num2, (a, b) -> a / b);
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        System.out.println("O resultado é: " + result);
    }

    public static double calculate(double num1, double num2, Operation operation) {
        return operation.apply(num1, num2);
    }

    interface Operation {
        double apply(double num1, double num2);
	}

}
