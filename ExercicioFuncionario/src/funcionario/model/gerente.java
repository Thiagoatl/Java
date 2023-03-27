package funcionario.model;

public class gerente extends funcionario {
    private String pl;

    public gerente(String nome, int idade, String cargo, double salario, boolean ativo, String pl) {
        super(nome, idade, cargo, salario, ativo);
        this.pl = pl;
    }


    public String getArea() {
		return pl;
	}


	public void setArea(String area) {
		this.pl = pl;
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
		System.out.println("Nivel de Permissão: " + pl);
}
	}