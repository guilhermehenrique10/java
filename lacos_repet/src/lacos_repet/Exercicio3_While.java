package lacos_repet;

import java.util.Scanner;

public class Exercicio3_While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade; 
		int qteMenor = 0;
		int qteMaior = 0;
		
		System.out.println("Digite a sua idade: " );
	    idade = leia.nextInt();
		
	    if(idade < 21 && idade > 0) 
	    	qteMenor += 1;
	    else if(idade > 50) 
	    	qteMaior += 1;
	    
		while(idade > 0) {
			
			System.out.println("Digite a sua idade: " );
		    idade = leia.nextInt();
		    
		    if(idade < 21 && idade > 0) 
		    	qteMenor += 1;
		    else if(idade > 50) 
		    	qteMaior += 1;
		    
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + qteMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + qteMaior);
		
		leia.close();

	}

}
