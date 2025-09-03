package Java1;

import java.util.Scanner;

public class LombadaEletronica {
    public static void main(String[] args) {
       
Scanner scanner = new Scanner(System.in);
      
        System.out.print("Qual é a velocidade do carro em Km/h? ");
        int velocidade = scanner.nextInt();

        if (velocidade > 80) {
            int multa = (velocidade - 80) * 5;
            System.out.println("Você foi multado! O valor da multa é de R$" + multa);
        } else {
            System.out.println("Velocidade dentro do limite permitido. Dirija com segurança!");
        }
    }
}
