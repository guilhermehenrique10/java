package generation_exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_01 {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat ("#00,000.0");
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o seu salário: R$");
		salario = leia.nextFloat();
		
		System.out.println("Digite o seu abono: R$");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("O seu novo salário é: R$ " + df.format(novoSalario) + " reais ");
		
		leia.close();
		
	}

}
