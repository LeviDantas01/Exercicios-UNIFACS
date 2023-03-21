package exercicios;
//14. Fazer um programa que recebe dois números e mostra o maior
import java.util.Scanner;

public class MostraMaior {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite um numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite outro: ");
		num2 = sc.nextInt();
		
		System.out.println(num1 > num2 ? num1 + " e maior que " + num2 : num2 + " e maior que " + num1);
	}
	
}
