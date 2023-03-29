package orientacao_objetos;

public class TestaCliente {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica ("Guilherme", 1, 1000.00f, 2, 4);
		pf.visualizar();
		
		PessoaJuridica pj = new PessoaJuridica("Guilherme Henrique", 18, 1000.00f, 8, 3, "40.400.578/0123-90");
		pj.visualizar();
		
	}

}
