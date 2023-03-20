package lacos_repet;

import java.util.Scanner;

public class Exercicio5_DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		float numero;
		float media;
		float soma = 0;
		int qte = 0;
	    
	    do {
	    
	    	System.out.println("Digite um número: ");
		    numero = leia.nextFloat();
		    
		    if (numero % 3 == 0 && numero != 0) {
		    	soma += numero;
		        qte += 1;
		    }
		    
		    	media = soma / qte; 	
		    		
	    } while(numero != 0);
	    
	    System.out.println("\nA média de todos os números múltiplos de 3 é: " + media );
	    
	    leia.close();

	}

}
