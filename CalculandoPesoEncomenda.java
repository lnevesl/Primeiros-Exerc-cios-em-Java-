package Java1;
//7) Crie um programa que leia o peso de uma encomenda (em kg) 
//e imprima o valor do frete (considerando que cada kg custa R$5,00).


import java.util.Scanner;

public class CalculandoPesoEncomenda {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o peso em kg da encomenda: ");
		 Double pesoEncomenda = scan.nextDouble();
		 
			System.out.print("O valor da encomenda é: "  + (pesoEncomenda * 5) );
		
			scan.close();
	}
	
	
}
