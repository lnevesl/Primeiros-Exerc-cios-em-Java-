//4) Escreva um programa que leia o nome e a idade de uma pessoa e diga se ela 
//pode votar ou não nas eleições. No Brasil, o voto é obrigatório para pessoas entre 18 e 70 anos,
//e facultativo para pessoas entre 16 e 18 anos ou maiores de 70 anos.

package Java1;

import java.util.Scanner;

public class PodeVotar {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade para sabr se você pode votar ou nao. ");
		int idade = scan.nextInt();
		
		if(idade >= 18 && idade <= 70) {
			System.out.print("Você pode votar!");
		} else if(idade >= 16 && idade <= 18 || idade > 70) {
			System.out.print( "Voto Facultativo");
		} else {
		System.out.println("Você não pode votar");
		}
		
		scan.close();  
}
		
}
	
	


