package Java1;

import java.util.Scanner;

public class DobroDoNumeroESuaTercaParte {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	System.out.println("---------------------------");
	System.out.println("7) Crie um algoritmo que leia um número "
			+ "real e mostre na tela o seu dobro e a sua terça parte.\n"
			+ "Ex:\n"
			+ "Digite um número: 3.5\n"
			+ "O dobro de 3.5 é 7.0\n"
			+ "A terça parte de 3.5 é 1.16666\n"
			+ "");
	
	System.out.println("---------------------------");
	System.out.println("                           ");

	System.out.println("Informe um número: ");
	double numero = scan.nextDouble();
	System.out.println("O número Digitado foi: " + numero);
	System.out.println("O dobro do número é: " + numero * 2);
	double divisao = (double) numero / 3;

	System.out.println("Sua Terça parte é: " + divisao);
	scan.close();
	}
}
