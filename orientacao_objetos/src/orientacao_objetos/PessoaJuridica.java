package orientacao_objetos;

public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica(String nome, int genero, float rg, int id, int pagamento, String cnpj) {
		super(nome, genero, rg, id, pagamento);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ do cliente: " + this.cnpj);
	}

}
