package exercicios;

import java.util.Scanner;

/*		11. Fazer um programa que recebe o salário-base de um funcionário, calcula e mostra o salário a
		receber, sabendo-se que esse funcionário tem gratificação de 5% sobre o salário-base e paga
		imposto de 7% sobre o salário-base.
*/

public class CalculaSalario {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salarioBase, salarioFinal, valorImposto;
		double gratificacao = 5, imposto = 7;
		
		System.out.print("Informe seu salario: ");
		salarioBase = sc.nextDouble();
		
		salarioFinal = gratificacao * salarioBase / 100;
		
		salarioFinal += salarioBase;
		
		valorImposto =  (salarioFinal * imposto) / imposto;
		
		System.out.println(salarioFinal + " " +valorImposto);
		
		
		
		
		
	}
	
}
