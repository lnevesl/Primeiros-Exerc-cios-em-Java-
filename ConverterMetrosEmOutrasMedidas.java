/*

8) Desenvolva um programa que leia uma distância em metros e mostre os 
valores relativos em outras medidas.
Ex:
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a: 0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm
*/

package Java1;

import java.util.Scanner;

public class ConverterMetrosEmOutrasMedidas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("--------------------------------------------");
		System.out.println("CONVERSOR DE METRO PARA:");
		System.out.println("--------------------------------------------");
		System.out.println("Para converte de metro para outa medida digite um número: ");
		double numero = scan.nextDouble();
		
		System.out.println("Agora selecione em que medida quer converter:");
		System.out.println("(1) - Km");
		System.out.println("(2) - Hm");
		System.out.println("(3) - Dam");
		System.out.println("(4) - dm");
		System.out.println("(5) - cm");
		System.out.println("(6) - mm");
		System.out.println("--------------------------------------------");
		int opcao = scan.nextInt();
		System.out.println("--------------------------------------------");
		if(opcao == 1) {
			System.out.print(numero + "m = ");
			System.out.println(numero/1000 + "Km");
		} else if(opcao == 2) {
			System.out.print(numero + "m = ");
			System.out.println(numero/100 + "Hm");
		} else if(opcao == 3) {
			System.out.print(numero + "m = ");
			System.out.println(numero/10 + " Dam");
		} else if(opcao == 4) {
			System.out.print(numero + "m = ");
			System.out.println(numero*10 + " dm");
		} else if(opcao == 5) {
			System.out.print(numero + "m = ");
			System.out.println(numero*100 + " cm");
		} else if(opcao == 6) {
			System.out.print(numero + "m = ");
			System.out.println(numero*1000 +" mm");
		} else {
			System.out.println("Opção inválida");
		}
		scan.close();  
}
}
