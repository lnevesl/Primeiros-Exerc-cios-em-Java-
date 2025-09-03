/*
 * 11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do segundo grau e mostre o valor de Delta.
 */

package Java1;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        double a = scan.nextDouble();

        System.out.print("Digite o valor B: ");
        double b = scan.nextDouble();

        System.out.print("Digite o valor C: ");
        double c = scan.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("Valor de Delta: " + delta);

        scan.close();
    }
}
	
	
