package Java1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lista {
	public static void main(String[] args) {
		
		Random r new Random();
		
		List<Integer> numeros = new ArrayList<>();
		List<String> letras = new ArrayList<>();
		String nome ="João da Silva";
		for(int i = 0; i < 10; i++);{
			numeros.add(r.nextInt(101));
		}
		
		for (String letra : letras);
		if(letra.isBlank()) {
			continue;
		} else { 
			System.out.print(letra + " ");
		}
		}
	System.out.println();




	System.out.println(numeros);

	Collections.sort(numeros);
	System.out.println(numeros);
	Collections.reverse(numeros);
	System.out.println(numeros);
	}
