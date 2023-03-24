package exercicio4;

public class farmacia {
	private String Produto;
	private double Preco;
	private String Cliente;
	private String tipodeproduto;
	private int quantidade;



public farmacia(String produto, double preco, String cliente, String tipodeproduto, int quantidade) {
		super();
		Produto = produto;
		Preco = preco;
		Cliente = cliente;
		this.tipodeproduto = tipodeproduto;
		this.quantidade = quantidade;
	}



public String getProduto() {
	return Produto;
}


public void setProduto(String produto) {
	Produto = produto;
}


public double getPreco() {
	return Preco;
}


public void setPreco(double preco) {
	Preco = preco;
}


public String getCliente() {
	return Cliente;
}


public void setCliente(String cliente) {
	Cliente = cliente;
}


public String getTipodeproduto() {
	return tipodeproduto;
}


public void setTipodeproduto(String tipodeproduto) {
	this.tipodeproduto = tipodeproduto;
}


public int getQuantidade() {
	return quantidade;
}


public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public void visualizar() {
	System.out.println("Produto: " + Produto);
	System.out.println("Preco: " + Preco);
	System.out.println("Cliente: " + Cliente);
	System.out.println("Tipo de produto: " + tipodeproduto);
	System.out.println("Quantidade: " + quantidade);
	System.out.println("Valor final: " + (quantidade * Preco));

}
}