//Escreva um programa que leia dois números inteiros do usuário e 
//diga qual é o maior, o menor ou se são iguais.
//

package Java1;

import java.util.Scanner;


public class MaiorOuMenor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
        int numero1 = scan.nextInt();
        
		System.out.print("Digite outro numero inteiro: ");
        int numero2 = scan.nextInt();
		
        if (numero1 > numero2) {
        	System.out.println(numero1 + " é maior que." + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " é maior que " + numero1);
        } else {
            System.out.println("Os números são iguais.");
        }
        
        scan.close();
	}
}
	
	
