package exercicios;

import java.util.Scanner;

//18. Ler um valor em real e a cotação do dólar. Em seguida, exibir o valor correspondente
//em dólares.
public class RealParaDolar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double real, dolar, cotacao;
		
		System.out.print("Valor em R$: ");
		real = sc.nextDouble();
		
		System.out.print("Cotacao: ");
		cotacao = sc.nextDouble();
		
		dolar = real / cotacao;
		
		System.out.println(dolar);
		
	}
}
