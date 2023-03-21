package exercicios;

import java.util.Scanner;

/*10. Fazer um programa que recebe o preço de um produto,
 *  calcula e mostra o novo preço sabendose que este sofreu 
 *  um desconto de 10%.
 **/

public class CalculaDesconto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double desconto, preco, precoFinal;
		
		System.out.print("Qaul preco: ");
		preco = sc.nextDouble();
		
		desconto = 15;
		
		precoFinal = desconto * preco / 100;
		
		System.out.println(preco + precoFinal);
		
		
	}

}
