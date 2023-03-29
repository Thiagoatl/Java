package aula_exceptions;

public class ExcecaoSimples extends Exception {

	private static final long serialVersionUID = 1l;

	public ExcecaoSimples() {
	}

	public ExcecaoSimples(String mensagem) {
		super(mensagem);
	}

}
