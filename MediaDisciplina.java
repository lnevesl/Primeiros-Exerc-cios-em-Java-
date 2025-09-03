/*5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e
8.5 é igual a 6.5
*/

package Java1;

public class MediaDisciplina {
	public static void main(String[] args){
	 
		double nota1 = 4.5;
		double nota2 = 8.5;
		System.out.println("nota1 = 4.5");
		System.out.println("nota2 = 8.6");
		
		double  soma = nota1 + nota2;
		double media = soma / 2;
		
		System.out.println("A média entre as duas notas é igual: " + media);
	
	}
}
