package Java1;

//1. Crie uma lista de inteiros e adicione 10 valores.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class NumIntAdicinarDez {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		List<String> numeros = new ArrayList<>();
		
		int num = 0;
//2. Adicione o número 11 à lista anterior.		
		for (int i = 0; i <= 9; i++) {
		System.out.println("Digite um número: ");
		numeros.add(scan.next());
		}
		
			System.out.println("Numeros são: " + numeros);			
// 3.  Removendo a casa 5:
			        System.out.println("O numero Removido foi:  " + numeros.remove(4) + " - Referente a 5 posição.");
			        System.out.print("Numeros cadastradas após remoção:\n");
//4. Concatene a lista atual com uma nova lista
		  for(int i = 0; i < numeros.size(); i++)
			        {
//5. Imprima o tamanho da lista atual.
			            System.out.print(numeros.get(i) + " ");
        }
//        boolean temOito = false;
//        if(numeros.contains(8)){
//        	System.out.println("N Contem 8 ");
//        	else {
//        	System.out.println("Contem 8 ");
        	
        //6. Verifique se o valor 8 está presente na lista.
		  String temOito = numeros.contains("8") ? "Sim" : "Não";
        System.out.println("\nTem oito? " + temOito);
       
        //7. Inverta a ordem de elementos da lista
        System.out.println("Invertendo a lista:");
        int inverterLista = numeros.size() - 1;
        for (int i = inverterLista; i >= 0 ; i--) {
            System.out.print(numeros.get(i) + " ");
        }
        
//        System.out.println("\n Numeros Pares da Lista: " + " ");
//        for(int i = 0; i < numeros.size(); i++)
//            if(i % 2 == 0) {
//            	System.out.print(numeros.get(i) + " ");
////        
       System.out.println("Os numero Removido foi:  " + numeros.remove(4) + " - Referente a 5 posição.");
//        	if(numeros.contains("numeros %= 2 == 0")){
//        		System.out.println("Lista sem numeros pares: " + numeros.remove();
//        	}
       	int inverterLista = numeros.size() - 1;
        	for(int i = 0; i < numeros.size(); i++)
        	if(i (%= 2 == 0)) {
            	System.out.print(numeros.get(i) + " ");
//        	
        }
        	
        
        }
}

      
    
