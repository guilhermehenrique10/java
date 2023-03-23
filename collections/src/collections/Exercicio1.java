package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		String cor;

		System.out.println("Digite 5 cores ");

		for (int contador = 1; contador <= 5; contador++) {

			System.out.println("\nDigite a " + contador + "º cor: ");
			cor = leia.nextLine();
			cores.add(cor);

		}

		System.out.println("\nCores Adicionadas: ");
		for (var eCor : cores)
			System.out.println(eCor);

		System.out.println("\nCores em Ordem: ");
		cores.sort(null);
		for (var eCor : cores) 
			System.out.println(eCor);

		leia.close();

	}

}
