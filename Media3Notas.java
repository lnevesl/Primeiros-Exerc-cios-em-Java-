//3) Escreva um programa que leia três notas de um aluno e calcule a média. Se a média for maior 
//ou igual a 7, o aluno está aprovado. Se a média for menor que 4,
//o aluno está reprovado. Se a média estiver entre 4 e 7, o aluno precisa fazer uma prova final.

package Java1;

import java.util.Scanner;

public class Media3Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else if (media < 4) {
            System.out.println("Aluno Reprovado!");
        } else {
            System.out.println("Precisa fazer uma prova final.");
        }

        scan.close();
    }
}