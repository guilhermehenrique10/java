package lacos_repet;

import java.util.Scanner;

public class Exercicio1_For {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		int qtePar = 0;
		int qteImp = 0;

		for (int contador = 1; contador <= 10; contador++) {

			System.out.println("Digite o " + contador + " número: ");
			numero = leia.nextInt();

			if (numero % 2 == 0)
				qtePar += 1;
			else if (numero % 2 != 0)
				qteImp += 1;

		}

		System.out.println("\nTotal de números pares: " + qtePar);
		System.out.println("Total de números ímpares: " + qteImp);

		leia.close();

	}

}
