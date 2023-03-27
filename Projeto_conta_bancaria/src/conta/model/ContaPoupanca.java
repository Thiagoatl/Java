package conta.model;

public class ContaPoupanca extends Conta {

	private float limite;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}
	
	public float getAniversario() {
		return limite;
	}

	public void setAniversario(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) {

		if (this.getSaldo() + this.getAniversario() < valor) {
			System.out.println("\nSaldo é insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo()  - valor);
		return true;

	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Saque Aniversário: " + this.getAniversario());
	}

}	
