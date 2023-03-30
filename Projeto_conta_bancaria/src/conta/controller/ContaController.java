package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("A conta" + conta + "não foi encontrada!");

	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("A conta número: " + conta.getNumero() + "Foi criada com sucesso!");
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		var buscaConta = buscarNaCollection(conta.getNumero());
		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("Os dados da Conta" + buscaConta + "foram atualizados com sucesso!");
		} else
			System.out.println("A conta " + buscaConta + " não foi encontrada!");
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (listaContas.remove(conta) == true)
				;
			System.out.println("A conta " + conta + " foi excluida!");
		} else
			System.out.println("A conta " + conta + " não foi encontrada!");

	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (conta.sacar(valor) == true)
			System.out.println("O saque de " + valor + " foi efetuado com sucesso!");
		} else
			System.out.println("A conta " + conta + " não foi encontrada!");

	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			conta.depositar(valor);
			System.out.println("O saque de "+ valor +" foi efetuado com sucesso!");
		} else
			System.out.println("A conta " + conta + " não foi encontrada!");

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			if(contaOrigem.sacar(valor) == true) {
			contaDestino.depositar(valor);
			System.out.println("A transferencia foi efetuada com sucesso!");
		} else
			System.out.println("A conta " + contaDestino + " não foi encontrada!");}
	}

	// Metodos Auxiliares

	public int gerarNumero() {
		return ++numero;
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
return null;
	}
	public int retornaTipo(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta.getTipo();
			}
		}
		return numero;
	}
}
