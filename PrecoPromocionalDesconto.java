package Java1;

import java.util.Scanner;

public class PrecoPromocionalDesconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scan.nextDouble();

        double desconto = preco * 0.05;
        double precoPromocional = preco - desconto;

        System.out.println("O preço promocional do produto com 5% de desconto é: " + precoPromocional);

        scan.close();
    }
}