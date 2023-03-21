package vetor;

import java.util.Scanner;

public class Exercicio1_Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		boolean certo = false;
		
		int vetorInteiros[] = {2,5,1,3,4,9,7,8,10,6};
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		for (int contador = 0; contador < 10; contador ++) {
			if(vetorInteiros[contador] == numero) {
			System.out.println("\nO número " + numero + " está localizado na posição: " + contador );
			certo = true;
			
			}
		}
		
		if(certo == false) {
			System.out.println("\nO número " + numero + " não foi encontrado! ");
			
		}
		
		leia.close();

	}

}
