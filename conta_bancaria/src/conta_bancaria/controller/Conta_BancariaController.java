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
		
		if(conta != null)
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
	
	/* Métodos Auxiliares */
	 
	public int gerarNumero() {
		return ++ numero;
		
	}
	
	public Conta_Bancaria buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		
		return null;
	}
	
}

	
	
	