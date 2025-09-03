
package Java1;

import java.util.Scanner;


/* 10- Escreva um programa que leia o salário de um funcionário e aplique um aumento de acordo com a seguinte tabela:

Faixa salarial: Até R$ 1.500,00
Percentual de Aumento: 15%

Faixa Salarial: De R$ 1.500,01 até R$ 2.500,00
Percentual de Aumento: 10%

Faixa Salarial: Acima de R$ 2.500,00
Percentual de Aumento: 5%                 */

public class AumentoSalario {

        Scanner scan = new Scanner (System.in);

        System.out.println("Informe o seu salario: ");
        double faixaSalarial = scan.nextDouble();

        double novoSalario = 0;

        if(faixaSalarial <= 1500 ){
            novoSalario = faixaSalarial * 1.5;  
        System.out.printf("Seu salario atual:\nR$ %.2f", faixaSalarial);
        System.out.println(" Percentual de Aumento: 15%");
        System.out.printf( "Salário com aumento: R$ %.2f  " , novoSalario);

        }else if(faixaSalarial <= 2500.00){
            novoSalario = faixaSalarial * 1.1; 
            System.out.printf("Seu salário atual:\nR$ %.2f", faixaSalarial);
            System.out.println(" Percentual de Aumento: 10%");
            System.out.printf( "Salario com aumento: R$ %.2f  " , novoSalario);

        }else if(faixaSalarial > 2500.00){
            novoSalario = faixaSalarial * 1.05; 
            System.out.printf("Seu salário atual:\nR$ %.2f", faixaSalarial);
            System.out.println(" Percentual de Aumento: 5%");
            System.out.printf( "Salario com aumento: R$ %.2f  " , novoSalario);
        }

        
        scan.close();
    }
}

        
        
        
        



/*
 		public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Digite o salário do funcionário: ");
  
  double salario = scan.nextDouble();

  double novoSalario = salario * 1.15;

  System.out.println("O novo salário do funcionário com 15% de aumento é: " + novoSalario);
  
  scan.close();
}
}
*/
  
        
        
        
  