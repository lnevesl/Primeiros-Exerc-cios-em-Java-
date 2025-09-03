//15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário, 
//sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.

package Java1;

import java.util.Scanner;

public class DiasTrabalhadosSalario {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos dias traballhou: ");
		int diasTrabalhados = scan.nextInt();
		System.out.print("Você v ai receber: " + diasTrabalhados * 200 + " Reais.");
		
		scan.close();
		
		
		
	}
	
	
	
}
