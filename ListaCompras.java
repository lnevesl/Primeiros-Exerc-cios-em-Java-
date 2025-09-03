package Java1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListaCompras {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
//faça uma simulação de uma caixa de supermercado
//usando listas

	List<String> produtos = new ArrayList<>();
	List<Double> precos = new ArrayList<>();
	String opcao;
	int quantidade = 1;
	double total = 0;
	double preco = 0;
	double precoTotal = 0;
	do {
		
		System.out.println("Informe o nome do produto:");
		produtos.add(scan.nextLine());
		System.out.println("Informe a quantidade de produtos");
		quantidade = scan.nextInt();
		System.out.println("Informe o preço do produto:");
		preco = scan.nextDouble();
		precoTotal = preco * quantidade;
		
		precos.add(precoTotal);
		System.out.println("Deseja continuar? S/N");
		opcao = scan.next().toLowerCase();
		scan.nextLine();
		
	} while(opcao.equals("s"));
	
	for(Double preço : precos) {
		total += preço;
	}
	System.out.println(produtos);
	System.out.println(precos);
	System.out.println("Total: R$ " + total);
	
}



List<String> produtos = new ArrayList<>();
List<Double> precos = new ArrayList<>();
List<Integer> quantidade = new ArrayList<>();

	String opcao;

 do {
     System.out.println("Informe o nome do produto: ");
     	produtos.add(scxan.nextLine());
     
     System.out.println("Informe a quantidade de produtos: ");
     	quantidade.add(scan.nextInt());
     
     System.out.println("Informe o preço do produto: ");
     	precos.add(scan.nextDouble());
     
     System.out.println("Deseja adicionar mais algum produto? (S/N)");
     	opcao = scan.next().toLowerCase();
     		scan.nextLine();
     
 } 	while (opcao.equals("s"));
 
 	double total = 0;
 
 	for (int i = 0; i < produtos.size(); i++) {
     total += quantidade.get(i) * precos.get(i);
 }
 
	System.out.println("Produtos: " + produtos);
    System.out.println("Quantidades: " + quantidade);
    System.out.println("Preços: " + precos);
    System.out.println("Total: R$" + total);
/*