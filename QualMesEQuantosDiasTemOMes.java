//5) Escreva um programa que leia o mês do ano em número (1 a 12) e 
//diga quantos dias ele tem. Considere que o ano não é bissexto.

package Java1;

import java.util.Scanner;

public class QualMesEQuantosDiasTemOMes {
public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
	       System.out.print("Digite o número do mês (1 a 12): ");
	        int mes = scan.nextInt();
	        
	        switch (mes) {
	            case 1, 3, 5, 7, 8, 10, 12:
	                System.out.println("Este mês tem 31 dias.");
	                break;
	            case 4, 6, 9, 11:
	                System.out.println("Este mês tem 30 dias.");
	                break;
	            case 2:
	                System.out.println("Este mês tem 28 dias.");
	                break;
	            default:
	                System.out.println("Número de mês inválido. Por favor, insira um número de 1 a 12.");
	        }
	        
	        scan.close();
	    }		
		
}
