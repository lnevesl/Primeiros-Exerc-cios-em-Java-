package Java1;

//Crie um programa que leia o número de horas trabalhadas por um funcionário 
//e o valor da hora de trabalho e imprima o salário bruto desse funcionário.
//

import java.util.Scanner;
public class HoraTrabalhada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();

        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = scan.nextDouble();

        double salarioBruto = horasTrabalhadas * valorHora;

        System.out.println("O salário bruto do funcionário é: R$" + salarioBruto);

       scan.close();
    }
}