package conta_bancaria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.Conta_BancariaController;
import conta_bancaria.util.Cores;
import contabancaria.model.ContaCorrente;
import contabancaria.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
		Conta_BancariaController contas = new Conta_BancariaController();

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "************************************************************************");
			System.out.println("                                                                        ");
			System.out.println("                        BANCO DO BRASIL COM Z                           ");
			System.out.println("                                                                        ");
			System.out.println("************************************************************************");
			System.out.println("                                                                        ");
			System.out.println("                    1 - Criar Conta                                     ");
			System.out.println("                    2 - Listar todas as Contas                          ");
			System.out.println("                    3 - Buscar Conta por Número                         ");
			System.out.println("                    4 - Atulizar Dados da Conta                         ");
			System.out.println("                    5 - Apagar Conta                                    ");
			System.out.println("                    6 - Sacar                                           ");
			System.out.println("                    7 - Depositar                                       ");
			System.out.println("                    8 - Transferir valores entre contas                 ");
			System.out.println("                    9 - Sair                                            ");
			System.out.println("                                                                        ");
			System.out.println("************************************************************************");
			System.out.println("Entre com a opção desejada:                                             ");
			System.out.println(
					"                                                                        " + Cores.TEXT_RESET);
            try {
			    opcao = leia.nextInt();
            }catch(InputMismatchException e) {
            	System.out.println("Digite os valores inteiros! ");
            	leia.nextLine();
            	opcao = 0;
            }
            
			if (opcao == 9) {
				System.out.println(Cores.TEXT_CYAN_BOLD + "\n Banco do Brasil com Z - O seu futuro começa aqui! ");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n ");
				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();
					
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));

				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();
                    
					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}
				}
				KeyPress();
				break;
			case 2:
				System.out.println("Listar todas as Contas \n\n ");
                contas.listarTodas();
				KeyPress();
				break;

			case 3:
				System.out.println("Consultar dados das Conta - por número \n\n ");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				contas.procurarPorNumero(numero);
				
				KeyPress();
				break;

			case 4:
				System.out.println("Atualizar dados da Conta \n\n ");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				tipo = 1;
				// condicional buscar na collection

				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();

				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				// retornar tipo

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversário da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca

				}
				default -> {
					System.out.println("Tipo de conta inválido!");

				}
				}

				// fim do condicional buscar na collection
				KeyPress();
				break;

			case 5:
				System.out.println("Apagar Conta \n\n ");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				KeyPress();
				break;
			case 6:
				System.out.println("Saque\n\n ");

				System.out.println("Digite o nímero da conta: ");
				valor = leia.nextFloat();

				System.out.println("Digite o valor do Saque: ");
				valor = leia.nextFloat();

				KeyPress();
				break;
			case 7:
				System.out.println("Depósito \n\n ");

				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				System.out.println("Digite o valor do Depósito: ");
				valor = leia.nextFloat();

				KeyPress();
				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n ");

				System.out.println("Digite o Número da Conta de Origem: ");
				numero = leia.nextInt();

				System.out.println("Digite o Número da Conta de Destino: ");
				numeroDestino = leia.nextInt();

				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = leia.nextFloat();
				} while (valor <= 0);

				KeyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n ");
				
				KeyPress();
				break;

			}

		}

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Guilherme Henrique - guilhermehenriquelima02@gmail.com ");
		System.out.println("github.com/guilhermehenrique10 ");
		System.out.println("***********************************************************");

	}
	
	public static void KeyPress() {
		
		try {
			System.out.println(Cores.TEXT_RESET + "Pressione a tecla enter para continuar... ");
		    System.in.read();
		}catch (IOException e) {
			System.out.println("Erro de digitação! ");
		}
		
	}

}
