package orientacao_objetos;

public class Cliente {

	private String nome;
	private int genero;
	private float rg;
	private int id;
	private int pagamento;
	
	public Cliente(String nome, int genero, float rg, int id, int pagamento) {
		this.nome = nome;
		this.genero = genero;
		this.rg = rg;
		this.id = id;
		this.pagamento = pagamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getgenero() {
		return genero;
	}

	public void setgenero(int genero) {
		this.genero = genero;
		}   

	public float getRg() {
		return rg;
	}

	public void setRg(float rg) {
		this.rg = rg;
	}

	public float getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public int getPagamento() {
		return pagamento;
	}

	public void setPagamento(int pagamento) {
		this.pagamento = pagamento;
	}
	
	public void visualizar() {
		
		String pagamento = "";
		
		switch(this.pagamento) {
		case 1 -> pagamento = "Cartão de Crédito";
		case 2 -> pagamento = "Cartão de Débito";
		case 3 -> pagamento = "Pix";
		case 4 -> pagamento = "Boleto";
		}
		
		String genero = "";
		
		switch(this.genero) {
		case 1 -> genero = "Masculino";
		case 2 -> genero = "Feminino";
		case 3 -> genero = "Não binario";
		case 4 -> genero = "Transgenero";
		case 5 -> genero = "Não dizer";
		
		}
			
		System.out.println("                                      ");
		System.out.println("**************************************");
		System.out.println("           DADOS DO CLIENTE           ");
		System.out.println("************************************");
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Genêro: " + genero);
		System.out.println("RG: " + this.rg);
		System.out.println("Id: " + this.id);
		System.out.println("Tipo de Pagamento: " + pagamento);
		System.out.println("                                      ");
		System.out.println("                                      ");
		
	}
	
}
