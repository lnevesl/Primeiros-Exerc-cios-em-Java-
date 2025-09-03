package Java1;

import java.util.Scanner;

public class ExercicioAula3 {
	public static void main(String [] args) {
	
		Scanner scan = new Scanner(System.in);
		
	 System.out.print("Digite o primeiro valor:Digite o primeiro valor: ");
	 int valor1 = scan.nextInt();

	 System.out.println("Digite o segundo valor:Digite o segundo valor:");
	 int valor2 = scan.nextInt();

	if(valor1 > valor2) {
		System.out.println("O primeiro valor é: ");
	} else if (valor2 > valor1) {
		System.out.println("O segundo valor é: ");
	} else {
		System.out.println("Os valores são iguais: ");
		}
	}
}

