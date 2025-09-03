package Java1;

import java.util.Scanner;

/* 
 *  Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho

 */
public class LendoNomeESalario {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		

		System.out.println("Informe o nome do Funcionário. ");
		String nomeFuncionario = scan.next();
		System.out.println("Informe o salário do funcionário. ");
		int numero = scan.nextInt();
		
		System.out.println("Funcioonario: " + nomeFuncionario);
		System.out.print("Salário: " + numero);
		scan.close();
	}
	

}
