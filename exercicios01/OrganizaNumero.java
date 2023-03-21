package exercicios;
//15. Fazer um programa que recebe três números e mostra-os em ordem crescente.
import java.util.Scanner;

public class OrganizaNumero {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, menor, maior;
		
		System.out.print("Informe um numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Mais um: ");
		num2 = sc.nextInt();
		
		System.out.print("O ultimo: ");
		num3 = sc.nextInt();
		
		menor = Math.min(num2, num3);
		maior = Math.max(num2, num3);
		
		if(num1 <= menor) {
			System.out.println(num1);
			System.out.println(menor);
			System.out.println(maior);
		} else if(num1 >= menor) {
			System.out.println(menor);
			if(num1 <= maior || num1 >= maior) {
				System.out.println(maior);
				System.out.println(num1);
			}
		}
	}
}
