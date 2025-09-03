package Java1;


/*
 * 16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um fumante. 
 * Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou. Considere que um fumante perde 10
 *  min de vida a cada cigarro. Calcule quantos dias de vida um fumante perderá e exiba o total em dias.
 */
import java.util.Scanner;

public class Desafio {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantidade de cigarros fumados por dia: ");
        int cigarrosPorDia = scan.nextInt();

        System.out.print("Anos fumando: ");
        int anosFumando = scan.nextInt();

        int totalCigarrosFumados = cigarrosPorDia * anosFumando * 365;
        int tempoPerdidoEmMinutos = totalCigarrosFumados * 10;
        int tempoPerdidoEmDias = tempoPerdidoEmMinutos / (24 * 60);

        System.out.println("Um fumante perderá aproximadamente " + tempoPerdidoEmDias + " dias de vida.");
        
        scan.close();	
		
		
		
	}
	
}
