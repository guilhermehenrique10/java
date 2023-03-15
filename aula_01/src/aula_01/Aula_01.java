package aula_01;

import java.util.Scanner;

public class Aula_01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero1, numero2; 
		String nome;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		System.out.println("Soma: " + (numero1 + numero2 ));
		

	}

}
