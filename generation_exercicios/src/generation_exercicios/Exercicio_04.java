package generation_exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("###,#00");
		
		float n1, n2, n3, n4;
		
		System.out.println("Informe o primeiro valor: ");
		n1 = leia.nextFloat();
		
		System.out.println("Informe o segundo valor: ");
		n2 = leia.nextFloat();
		
		System.out.println("Informe o terceiro valor: ");
		n3 = leia.nextFloat();
		
		System.out.println("Informe o quarto valor ");
		n4 = leia.nextFloat();
		
		System.out.println("Diferença do produto: " + df.format(n1 * n2 - n3 * n4));
		
		leia.close();

	}

}
