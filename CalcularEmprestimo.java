package Java1;

import java.util.Scanner;

public class CalcularEmprestimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo: ");
        double valorEmprestimo = scan.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaJuros = scan.nextDouble();

        System.out.print("Digite o número de meses: ");
        int numMeses = scan.nextInt();

        double parcelaMensal = (valorEmprestimo * taxaJuros / 100) / (1 - Math.pow(1 + taxaJuros / 100, -numMeses));

        System.out.printf("O valor da parcela mensal do empréstimo é: %.2f", parcelaMensal);

        scan.close();
    }
}
//5) Crie um programa que leia o valor de um empréstimo, 
//a taxa de juros mensal e o número de meses e imprima o valor 
//da parcela mensal do empréstimo.



//Math. pow() é uma ótima maneira de encontrar facilmente a potência de vários números, tanto
//inteiros quanto valores fracionários. Ao contrário de um método que você mesmo
//pode escrever, ele é altamente otimizado e adequado para uma variedade de 
//aplicativos de tempo crítico.
//Operadores aritméticos. Note que Java não possui um operador específico para potência
//(tal como ** em FORTRAN). Para calcular uma potência, você deve usar o método pow da classe Math
//do pacote lang, ou seja, para calcular xy,
//você escreve Math. pow(x, y), onde x e y são de tipo double, e o resultado também.
//Retorna um número especificado elevado à potência especificada.