package exercicios;

import java.util.Scanner;

/*	12. Fazer um programa que recebe o salário de um funcionário e o percentual de aumento, calcula e
	mostra o valor do aumento e o novo salário.*/
public class NovoSalario {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salarioAtual, percenAumento, salarioFinal;
		
		System.out.print("Informe seu salario: ");
		salarioAtual = sc.nextDouble();
		
		System.out.print("Qaul o percentual: ");
		percenAumento = sc.nextDouble();
		
		salarioFinal = (salarioAtual * percenAumento) / 100;
		salarioFinal+= salarioAtual;
		
		System.out.println(salarioFinal);
		
		
	}
	
}
