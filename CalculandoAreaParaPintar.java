//9) Crie um programa que leia a altura e largura de uma parede (em metros) e imprima 
//a área da parede e a 
//quantidade de tinta necessária para pintá-la (considerando que cada litro de tinta pinta 2m²).
//
//Fórmula para cálculo de área: 
//int area = alturaDaParede * larguraDaParede;
// calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o
//  serviço, sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
// */

package Java1;

import java.util.Scanner;

public class CalculandoAreaParaPintar {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos Calcular a área de uma parede a ser pintada e saber quantos litros de tinta vamos precisar");
		System.out.println("1L de tinta pinta 2 metros quadrados");
		System.out.println("-------------------------------------");
		System.out.println("Digite a Largura da parede: ");
		double largura = scan.nextDouble();
		System.out.println("Digite a Altura da parede: ");
		double altura = scan.nextDouble();
		
		System.out.println("Área Quadrada é: " + altura * largura + " metros quadrados");
		double area = altura * largura;
		int tinta = 2;
	
		System.out.println("Vamos precisar de: " + area / tinta + " Litros de tinta para pintar a parede.");
		
		scan.close();
	}
}
