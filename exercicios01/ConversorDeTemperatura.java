package exercicios;

import java.util.Scanner;

/*	Ler uma temperatura em graus Celsius e apresenta-la convertida em graus Fahrenheit. A fórmula
	de conversão é: F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C a temperatura em
	Celsius.*/
public class ConversorDeTemperatura {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double fahrenheit, celsius;
		
		System.out.print("Informe uma temperatura em C°: ");
		celsius = sc.nextDouble();
		
		fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println(fahrenheit);
		
		
	}
	
}
