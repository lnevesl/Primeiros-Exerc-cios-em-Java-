package Java1;

import java.util.Scanner;

//Crie um programa que leia a quantidade de litros de água consumidos por uma residência
//em um mês e imprima o valor da conta de água (considerando que cada litro de água custa R$0,02).

public class CqalculandoContaAgua {
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Digite a quantidade em litros de água consumidos: ");
	        int litrosConsumidos = scan.nextInt();

	        double valorConta = litrosConsumidos * 0.02;

	        System.out.println("O valor da conta de água é: R$" + valorConta);

	        scan.close();
	    }
	}