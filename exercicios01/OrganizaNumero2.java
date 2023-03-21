package exercicios;

import java.util.Scanner;

/*	16. Fazer um programa que recebe três números inteiros em ordem crescente e um quarto número
	também inteiro que não siga esta regra. Mostra, em seguida, os quatro números em ordem
	crescente.
*/
public class OrganizaNumero2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4;

		System.out.print("Informe um numero: ");
		num1 = sc.nextInt();

		System.out.print("Informe um numero: ");
		num2 = sc.nextInt();

		System.out.print("Informe um numero: ");
		num3 = sc.nextInt();

		System.out.print("Informe um numero: ");
		num4 = sc.nextInt();

		if (num4 < num1) {
			System.out.printf("%s, %s, %s, %s", num4, num1, num2, num3);
		} else if (num4 < num2) {
			System.out.printf("%s, %s, %s, %s", num1, num4, num2, num3);
		} else if (num4 < num3) {
			System.out.printf("%s, %s, %s, %s", num1, num2, num4, num3);
		} else {
			System.out.printf("%s, %s, %s, %s", num1, num2, num3, num4);
		}

	}
}
