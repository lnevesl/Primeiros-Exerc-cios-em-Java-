
//1) Escreva um programa que leia um número inteiro do usuário e diga se ele é par ou ímpar.
//
//Lembre-se de usar Scanner.


package Java1;

import java.util.Scanner;

public class ParOuImpar {

	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	
	        System.out.print("Digite um número inteiro: ");
	        int numero = scan.nextInt();
	        

	        if (numero % 2 == 0) {
	        	System.out.println(numero + " é um número par.");
	        } else {
	        	System.out.println(numero + " é um número ímpar.");
	        }

scan.close();
	          
	        
}
}


