package generation_exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,##0.0");
        Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		System.out.println("A média final é: " + df.format((nota1 + nota2 + nota3 + nota4) / 4 ));
		
		leia.close();
		
	}

}
