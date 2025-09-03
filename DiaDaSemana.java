package Java1;

import java.util.Scanner;

public class DiaDaSemana {

	
	/*12) Escreva um programa que leia um número inteiro entre 1 e 7 e
*  mostre o dia da semana correspondente. Se o número não estiver nesse intervalo,
*  mostre uma mensagem de erro..*/


Scanner scan = new Scanner(System.in);

	System.out.println("Digite um número inteiro: ");
	int numero = scan.nextInt();
	

switch (numero) {
case 1: 
	System.out.println("Domingo");
	break;
case 2:
	System.out.println("Segunda Feira");
	break;
case 3:	
	System.out.println("Terça Feira");
	break;
case 4:
	System.out.println("Quarta Feira");
	break;
case 5:
	System.out.println("Quinta feira");
	break;
case 6: 
	System.out.println("Sexta feira");
	break;
case 7:
	System.out.println("Sábado");
	break;
	default:
	System.out.println("Número invalido!");
}
	
}
}
