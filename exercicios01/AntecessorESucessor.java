package exercicios;

import java.util.Scanner;

//19. Ler um número inteiro e exibir o seu antecessor e o seu sucessor.

public class AntecessorESucessor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, antecessor, sucessor;
		
		System.out.print("Informe um número: ");
		num1 = sc.nextInt();
		sucessor = num1 + 1;
		antecessor = num1 - 1;
		
		System.out.println("Sucessor: "+ sucessor + " Antecessor: " + antecessor);
		
	}
}
