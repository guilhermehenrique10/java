package conta.repository;

import contabancaria.model.Conta_Bancaria;

public interface ContaRepository {

	// CRUD da Conta
		public void procurarPorNumero(int numero);
		public void listarTodas();
		public void cadastrar(Conta_Bancaria conta);
		public void atualizar(Conta_Bancaria conta);
		public void deletar(int numero);
		
		// Métodos Bancários
		public void sacar(int numero, float valor);
		public void depositar(int numero, float valor);
		public void transferir(int numeroOrigem, int numeroDestino, float valor);
		
}
