package Java1;

//3) Crie um programa que leia a distância percorrida por um carro (em km) e o tempo gasto (em horas) e imprima a velocidade média do carro.
//
//A fórmula de velocidade média é:
//
//velocidadeMedia = distanciaEmMetros / tempoEmSegundos;


import java.util.Scanner;

public class CalculadoraVelocidadeMedia {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em quilômetros: ");
        double distanciaEmKm = input.nextDouble();

        System.out.print("Digite o tempo gasto em horas: ");
        double tempoEmHoras = input.nextDouble();

        double distanciaEmMetros = distanciaEmKm * 1000;
        double tempoEmSegundos = tempoEmHoras * 3600;

        double velocidadeMedia = distanciaEmMetros / tempoEmSegundos;

        System.out.println("A velocidade média do carro é: " + velocidadeMedia + " m/s");

        input.close();
    }
}