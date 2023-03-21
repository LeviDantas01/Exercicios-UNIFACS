package exercicios;

import java.util.Scanner;

/*13. 	A nota final de um estudante é calculada a partir de três notas atribuídas respectivamente a um
		trabalho de laboratório, à avaliação semestral e a um exame final. A média das três notas
		mencionadas anteriormente obedece aos pesos a seguir:
		NOTA PESO
		Trabalho de laboratório 2
		Avaliação semestral 3
		Exame final 5
*/
public class NotaFinal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double trabalhoLab, avaliacaoSem, exameFinal, media;
		double pesoTrabalho = 2, pesoAvaliacao = 3, pesoExame = 5;
		
		System.out.print("Informe a nota do trabalho de laboratorio: ");
		trabalhoLab = sc.nextDouble();
		
		System.out.print("Informe a nota da avaliacao semestral: ");
		avaliacaoSem = sc.nextDouble();
		
		System.out.print("Informe a nota do exame fianl: ");
		exameFinal = sc.nextDouble();
		
		media = (trabalhoLab * pesoTrabalho + avaliacaoSem * pesoAvaliacao + exameFinal * pesoExame) / (pesoTrabalho + pesoAvaliacao + pesoExame);
		
		System.out.println(media);
		
		
		
	}
	
}
