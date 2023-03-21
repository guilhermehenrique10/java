package vetor;

import java.util.Scanner;

public class Exercicio4_matriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float matrizNotas[][] = new float[10][4];
		float vetorMedias[] = new float[10];
		float soma = 0, media = 0;

		for (int i = 0; i < matrizNotas.length; i++) {
			System.out.println("\nAluno " + (i + 1));

			for (int nota = 0; nota < matrizNotas[i].length; nota++) {
				System.out.println("Digite a nota do " + (nota + 1) + "° Semestre: ");
				matrizNotas[i][nota] = leia.nextFloat();

			}

		}

		for (int i = 0; i < matrizNotas.length; i++) {

			soma = 0;
			media = 0;

			for (int nota = 0; nota < matrizNotas[i].length; nota++) {
				soma += matrizNotas[i][nota];
			}

			media = soma / 4;

			vetorMedias[i] = media;
		}

		System.out.println("\n\nMédias: ");

		for (int i = 0; i < 10; i++) {
			System.out.println("Aluno " + i + ": " + vetorMedias[i]);
		}

		leia.close();

	}

}