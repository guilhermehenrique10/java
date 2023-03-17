package lacos_condicionais;

import java.util.Scanner;

public class Exercicio_01_switch {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int codigo, qte;

		System.out.println("Produtos disponíveis: \n");
		System.out.println("1\tCachorro Quente ");
		System.out.println("2\tX-Salada ");
		System.out.println("3\tX-bacon ");
		System.out.println("4\tBauru ");
		System.out.println("5\tRefrigerante ");
		System.out.println("6\tSuco de laranja ");

		System.out.println("\nDigite o Código do Produto: ");
		codigo = leia.nextInt();
		System.out.println("Digite a Quantidade do produto: ");
		qte = leia.nextInt();

		int pcCachorroQuente = 10;
		int pcXsalada = 15;
		int pcXbacon = 18;
		int pcBauru = 12;
		int pcRefrigerante = 8;
		int pcSucoLaranja = 13;

		switch (codigo) {
		case 1:
			System.out.println("\nProduto: Cachorro Quente ");
			System.out.println("Valor Total: R$ " + qte * pcCachorroQuente);
			break;
		case 2:
			System.out.println("\nProduto: X-Salada ");
			System.out.println("Valor Total da conta: R$ " + qte * pcXsalada);
			break;
		case 3:
			System.out.println("\nProduto: X-bacon ");
			System.out.println("Valor Total da conta: R$ " + qte * pcXbacon);
			break;
		case 4:
			System.out.println("\nProduto: Bauru ");
			System.out.println("Valor Total da conta: R$ " + qte * pcBauru);
			break;
		case 5:
			System.out.println("\nProduto: Refrigerante ");
			System.out.println("Valor Total da conta: R$ " + qte * pcRefrigerante);
			break;
		case 6:
			System.out.println("\nProduto: Suco de laranja ");
			System.out.println("Valor Total da conta: R$ " + qte * pcSucoLaranja);
			break;
		default:
			System.out.println("\nO código informado não existe! ");

			leia.close();
			
		}

	}

}
