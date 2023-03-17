package lacos_condicionais;

import java.util.Scanner;

public class Exercicio_03_if {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome, pergunta;
		int idade;
		boolean doacao = false;

		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		System.out.println("É sua primeira doação? (S/N): ");
		leia.skip("\\R?");
		pergunta = leia.nextLine().toUpperCase();

		if (pergunta == "S")
			doacao = true;

		if (idade >= 60 && idade <= 69) {
			if (doacao)
				System.out.println(nome + " não está apto para doar sangue! ");
			else
				System.out.println(nome + " está apto para doar sangue! ");
		} else if (idade < 18 || idade > 69)
			System.out.println(nome + " não está apto para doar sangue! ");
		else
			System.out.println(nome + " está apto para doar sangue ");

		leia.close();

	}

}
