package exercicios;

import java.util.Scanner;

/*9. Fazer um programa que recebe um número positivo, calcula e mostra:
a) O número digitado ao quadrado;
b) O número digitado ao cubo;
c) A raiz quadrada do número digitado*/

public class Operacoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num, numQuadrado, numCubo, numRaiz;
		
		System.out.print("Digite um numero: ");
		num = sc.nextDouble();
		
		numQuadrado = num * num;
		numCubo = num * num * num;
		numRaiz = Math.sqrt(num);
		
		System.out.println(numQuadrado+ "\n" + numCubo + "\n" + numRaiz);
		
		
	}
	
}
