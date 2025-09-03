package Java1;
//10) Crie um programa que leia o preço à vista de um produto e o número de parcelas e 
//imprima o valor de cada parcela (considerando juros simples de 2% ao mês).


import java.util.Scanner;

public class CalculandoJurosSimples {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto a vista: ");
		double valorProduto = scan.nextDouble();
		
		System.out.println("Digite oo numero de parcelas: ");
		double numeroParcelas = scan.nextDouble();
		
		double juros = 0.02;
        double valorParcela = (valorProduto + (valorProduto * juros * numeroParcelas)) / numeroParcelas;
		
		System.out.println("O valor de cada parcela à 2% ao mês é: R$ " + valorParcela);
		
		scan.close();
		
	}
	
	
	
}
//A fórmula do juro simples é J = C ∙ i ∙ t, em que J é o juro, C 
//é o capital, i é a taxa de juro e t é o tempo. Para calcular o juro simples, 
//basta substituir os valores na fórmula e realizar o cálculo. 
//Além do juro simples, existe também o juro composto, que possui 
//um acréscimo maior ao decorrer do tempo.