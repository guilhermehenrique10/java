package contabancaria.model;

public class ContaCorrente extends Conta{
	
	private float limite;

	public ContaCorrente(float limite) {
		super(int numero, int agencia, int tipo, String titular, float saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito " + this );

	}
	
}
