package lacos_condicionais;

import java.util.Scanner;

public class Exercicio_03_switch {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float numero1, numero2;
		int codigo;

		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();

		System.out.println("\nOperações Matemáticas disponíveis: \n");
		System.out.println("1\tSoma ");
		System.out.println("2\tSubtração ");
		System.out.println("3\tMultiplicação ");
		System.out.println("4\tDivisão ");

		System.out.println("\nDigite o Código da Operação que deseja realizar: ");
		codigo = leia.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("\nOperação: 1 ");
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;
		case 2:
			System.out.println("\nOperação: 2 ");
			System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			break;
		case 3:
			System.out.println("\nOperação: 3 ");
			System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
			break;
		case 4:
			System.out.println("\nOperação: 4 ");
			System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
			break;
		default:
			System.out.println("\nOperação Inválida! ");

			leia.close();
			
		}

	}

}
