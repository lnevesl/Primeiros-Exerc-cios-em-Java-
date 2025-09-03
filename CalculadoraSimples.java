//Escreva um programa que leia dois números inteiros e um operador aritmético (+, -, *, /) 
//e realize a operação correspondente. 
//Se o operador não for válido, mostre uma mensagem de erro.

package Java1;

import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.print("Digite o operador aritmético (+, -, *, /): ");
        char operador = scan.next().charAt(0);

        int resultado = 0;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operador inválido!");
        }

        System.out.println("Resultado: " + resultado);
        scan.close();
    }
    
   
}