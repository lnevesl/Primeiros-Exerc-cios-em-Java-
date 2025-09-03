package Java1;

import java.util.Scanner;

public class ExercicioCondicional2 {

	public static void main(String [] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dinforme um valor entre 1 a 7: ");
		int diaSemana = scan.nextInt();
		
		if(diaSemana == 1) {
			System.out.print("segunda");
		} else if(diaSemana == 2) {
			System.out.print( "Terça");
		} else if(diaSemana == 3) {
			System.out.print("Quarta");
		} else if(diaSemana == 4) {
			System.out.print( "Quinta");
		} else if(diaSemana == 5) {
			System.out.print("Sexta");
		} else if(diaSemana == 6) {
			System.out.print("Sabado");
		} else if(diaSemana == 7)
			System.out.print("Domingo");
		} else {
		System.out.println("Opção inválida");
		}
		
		scan.close();  
}
}
//		Switch(diaSemana) {
//			case 1: 
//				System.out.print("segunda");
//				break;
//	
//		
//}
