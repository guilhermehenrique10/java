package orientacao_objetos;

	public class PessoaFisica extends Cliente {

		private String nome;

		public PessoaFisica(String nome, int genero, float rg, int id, int pagamento) {
			super(nome, genero, rg, id, pagamento);
			this.nome = nome;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public PessoaFisica(String nome, int genero, float rg, int id, int pagamento, String nome2) {
			super(nome, genero, rg, id, pagamento);
			nome = nome2;
		}  
		
		@Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Nome do cliente: " + this.nome);
			
		}

	}
	
	
	

