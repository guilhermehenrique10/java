package generation_exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Informe o seu Salário Bruto: R$ ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Informe o seu Adicional Noturno: R$ ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Informe suas Horas Extras: R$ ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Informe os seus descontos: R$ ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("O seu Salário Líquido é: R$ " + df.format(salarioLiquido));
		
		leia.close();

	}

}
