package Java1;

import java.util.Scanner;

public class CalculandoIMC {
	/* Escreva um programa que leia o peso e a altura de uma pessoa
	 *  e calcule o seu índice de massa corporal (IMC).*/

	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o seu peso: ");
	double peso = scan.nextDouble();
	
	System.out.println("Digite a sua altura: ");
	double altura = scan.nextDouble();
	
	double IMC = peso/(altura*altura);
	
	System.out.printf(" Seu IMC é: %.2f\n " + IMC);
	
	if(IMC < 18.5) {
		System.out.println("Você está abaixo do peso.");
	}else if(IMC >= 18.5 && IMC <= 24.9) {
		System.out.println("Você está com o peso normal.");
	}else if(IMC >= 25 && IMC <= 29.9) {
		System.out.println("Você está com sobrepeso.");
	}else if(IMC >= 30 && IMC <= 34.9) {
		System.out.println("Você está com Obesidade grau I.");
	}else if(IMC >= 35 && IMC <= 39.9) {
		System.out.println("Você está com Obesidade grau II");
	}else if(IMC >= 40) {
		System.out.println("Você está com obesidade gra III");
	}else {
		System.out.println("O valor informado é invalido.");
	}
}
}
