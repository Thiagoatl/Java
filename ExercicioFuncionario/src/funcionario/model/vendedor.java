package funcionario.model;

public class vendedor extends funcionario {
    private boolean ap;

    public vendedor(String nome, int idade, String cargo, double salario, boolean ativo, boolean ap) {
        super(nome, idade, cargo, salario, ativo);
        this.ap = ap;
    }


    public boolean getArea() {
		return ap;
	}


	public void setArea(boolean ap) {
		this.ap = ap;
	}
    public boolean isAtivo() {
        return ativo;
        }

	public void visualizar() {
		System.out.println("Nome: " + getNome() );
		System.out.println("Idade: " + getIdade());
		System.out.println("Cargo: " + getCargo());
		System.out.println("Salario: " + getSalario());
		System.out.println("Ativo: " + (ativo ? "Sim" : "Não"));
		System.out.println("Acesso ao estoque:" + (ap ? "Sim" : "Não"));
}
	}