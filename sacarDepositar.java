package Java1;

import java.util.Scanner;

public class sacarDepositar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha entre uma das opçoes abaixo");
		String menu = """

		1) sacar;
		2) Deopsita;
		3) Transferir;
				
			""";	
		System.out.println(menu);
		int opcao = scan.nextInt();
		double saldo = 5000;
		
		switch (opcao) {
		case 1:
		System.out.println("Sacar:");
		System.out.println("Digite o valor do saque: ");
		double saque = scan.nextDouble();
		if(saldo >= saque) {
		System.out.println("Valor sacado foi: " + saque);
		} else  {
			System.out.println("Saldo insuficiente" );
		} 
		break;
		
		case 2:
			System.out.println("Depositar:");
			System.out.println("Valor do deposito: ");
			double deposito = scan.nextDouble();
			System.out.println("Valor depositado foi: " + deposito);
			 break;
		case 3:
			System.out.println("SDepositar:");
			System.out.println("Valor do deposito: ");
			double transferir = scan.nextDouble();
			System.out.println("Valor depositado foi: " + transferir);
		}

	
}
}
