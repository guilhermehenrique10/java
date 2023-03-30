package conta_bancaria.controller;

import java.util.ArrayList;

import conta.repository.ContaRepository;
import contabancaria.model.Conta_Bancaria;

public class Conta_BancariaController implements ContaRepository {

	private ArrayList<Conta_Bancaria> listaContas = new ArrayList<Conta_Bancaria>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("A conta não foi encontrada! ");

	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(Conta_Bancaria conta) {
		listaContas.add(conta);
		System.out.println("A conta numero: " + conta.getNumero() + " foi criada! ");

	}

	@Override
	public void atualizar(Conta_Bancaria conta) {
		
		var buscaConta = buscarNaCollection(conta.getNumero());
		
		if(buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("Os dados da conta foram atualizados com sucesso! ");
		} else
			System.out.println("A conta não foi encontrada! ");
		
	}

	@Override
	public void deletar(int numero) {

		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (listaContas.remove(conta) == true)
				System.out.println("A conta foi excluída! ");
		} else
			System.out.println("A conta não foi encontrada! ");

	}

	@Override
	public void sacar(int numero, float valor) {
		
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (conta.sacar(valor) == true)
				System.out.println("O saque foi efetuado com sucesso! ");
		} else
			System.out.println("A conta não foi encontrada! ");

	}

	@Override
	public void depositar(int numero, float valor) {
		
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			conta.depositar(valor);
				System.out.println("O depósito foi efetuado com sucesso! ");
		} else
			System.out.println("A conta não foi encontrada! ");

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);

		if (contaOrigem != null && contaDestino != null) {
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("A transfência foi efetuada com sucesso! ");
			}	
		} else
			System.out.println("A conta não foi encontrada! ");

	}

	/* Métodos Auxiliares */

	public int gerarNumero() {
		return ++numero;

	}

	public Conta_Bancaria buscarNaCollection(int numero) {
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
		
		return 0;
	}
}
