package Java1;

public class HorarioEm24H {

	/*15) Escreva um programa que leia a hora atual em formato 24 horas (0 a 23) e mostre uma saudação de acordo com o período do dia.

	Por exemplo, se a hora for 8, o programa deve mostrar “Bom dia”.
	Se a hora for 15, o programa deve mostrar “Boa tarde”.
	Se a hora for 22, o programa deve mostrar “Boa noite”.

	Se a hora não estiver nesse intervalo, o programa deve mostrar “Hora inválida”.*/

			 Scanner scanner = new Scanner(System.in);

		        System.out.println("Digite a hora atual (0 a 23): ");
		        int hora = scanner.nextInt();

		        String saudacao;

		        if (hora >= 0 && hora < 12) {
		            saudacao = "Bom dia!";
		        } else if (hora >= 12 && hora < 18) {
		            saudacao = "Boa tarde!";
		        } else if (hora >= 18 && hora < 24) {
		            saudacao = "Boa noite!";
		        } else {
		            saudacao = "Hora inválida.";
		        }

		        System.out.println(saudacao);
		    }
}