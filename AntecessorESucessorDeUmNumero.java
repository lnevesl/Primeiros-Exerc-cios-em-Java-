package Java1;

/* 
 6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10

 */

import java.util.Scanner;

public class AntecessorESucessorDeUmNumero {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	
		
		System.out.println("Digite um numero inteiro: ");
		int numero = scan.nextInt();

		System.out.println("Numero digitado:" + numero);
		System.out.println("Seu antecessor:" + (numero - 1));
		System.out.println("Seu sucessor:" + (numero + 1));
	
		scan.close();
	}
}
