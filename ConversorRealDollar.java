/*
8) Crie um programa que leia a cotação do dólar e um valor em reais e imprima 
o valor convertido em dólares.
*/


package Java1;

import java.util.Scanner;

public class ConversorRealDollar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------------------------");
		System.out.println("CONVERSOR DE REAL PARA DOLLAR:");
		System.out.println("--------------------------------------------");
		System.out.println("Digite a cotação do Dollar x Real: ");
			double dollar = scan.nextDouble();
		System.out.println("Digite o valor em Real a ser convertido:  ");
			double real = scan.nextDouble();	
		System.out.println("Valor em Dollar é: " + real / dollar + " Reais" );
		System.out.println("--------------------------------------------");
		
		scan.close();
	}
	

}
