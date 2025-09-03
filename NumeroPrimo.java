package Java1;

import java.util.Scanner;

public class NumeroPrimo {

	
//	13) Escreva um programa que leia um número inteiro positivo e diga se ele é primo ou não.
//
//	Um número é primo se ele é divisível apenas por 1 e por ele mesmo.                                                       Scanner scan = new Scanner(System.in);


Scanner scan = new Scanner(System.in);
	        System.out.println("Digite um número inteiro positivo: ");
	        int numero = scan.nextInt();

	       
	        boolean ePrimo = true;
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                ePrimo = false;
	                break;
	            }
	        }

	    
	        if (ePrimo) {
	            System.out.println("O número " + numero + " é primo.");
	        } else {
	            System.out.println("O número " + numero + " não é primo.");
	        }
}
}
