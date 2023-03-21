package exercicios;

import java.util.Scanner;
/*21. 	Sabe-se que um ano é bissexto se for divisível por 400 ou se for divisível por 4 e não
		for divisível por 100. Por exemplo: 1988, 1992, 1996, 2020. Determinar se um
		determinado ano lido é bissexto*/
public class AnaBissexto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ano;
		
		System.out.print("Informe um ano: ");
		ano = sc.nextInt();
		
		if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 == 0) {
			System.out.println("ano bissexto");
		} else {
			System.out.println("Nao bissexto");
		}
	}

}
