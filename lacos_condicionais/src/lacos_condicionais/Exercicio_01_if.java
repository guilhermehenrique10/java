package lacos_condicionais;

import java.util.Scanner;

public class Exercicio_01_if {

	public static void main(String[] args) {
		
	    Scanner leia = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.println("Digite o número A: ");
		v1 = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		v2 = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		v3 = leia.nextInt();
		
		if(v1 + v2 > v3) {
			System.out.println("\n" + v1 + "+" + v2 + "=" + (v1 + v2) + ">" + v3 + "\n");
			System.out.println("A soma de A + B é maior do que C ");
		} else if(v1 + v2 < v3) {
			System.out.println("\n" + v1 + "+" + v2 + "=" + (v1 + v2) + "<" + v3 + "\n");
			System.out.println("A soma de A + B é menor do que C ");
		} else if(v1 + v2 == v3) { 
			System.out.println("\n" + v1 + "+" + v2 + "=" + (v1 + v2) + "=" + v3 + "\n");
			System.out.println("A soma de A + B é igual a C ");
		} 
		
		leia.close();

	}

}
