package Java1;

import java.util.Scanner;

public class ConversorTemperatura {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);{


	        System.out.println("Digite a temperatura em Celsius: ");
	        double temperaturaCelsius = scan.nextDouble();

	      
	        System.out.println("Digite a opção de conversão (1 - Fahrenheit, 2 - Kelvin): ");
	        int opcaoConversao = scan.nextInt();

	        double temperaturaConvertida = 0;
	        switch (opcaoConversao) {
	            case 1:
	                temperaturaConvertida = temperaturaCelsius * 1.8 + 32;
	                System.out.println("A temperatura em Fahrenheit é: " + temperaturaConvertida);
	                break;
	            case 2:
	                temperaturaConvertida = temperaturaCelsius + 273.15;
	                System.out.println("A temperatura em Kelvin é: " + temperaturaConvertida);
	                break;
	            default:
	                System.out.println("Opção de conversão inválida!");
	        }

	        scan.close();
	    }
	}
}
