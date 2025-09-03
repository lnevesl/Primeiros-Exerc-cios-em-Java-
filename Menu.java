package Java1;

import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	{
	System.out.println("Escolha entre uma das opçoes abaixo");
	String menu = """

	1) Frente Da Loja
	2) Manutenção no Cadastro.;
	3) sair;
			
		""";
	System.out.println(menu);

	int opcao = scan.nextInt();
	
	switch(opcao) {
	case 1:
		System.out.println("---------------------------------");
		System.out.println("FRENTE DA LOJA");
		System.out.println("---------------------------------");
		
		
	
}
	}
}
