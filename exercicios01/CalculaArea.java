/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17
 * 2)Ler 4 números, calcular o quadrado para cada um,
 * somar todos os quadrados e mostrar o resultado.
 * 
 * 
 */
public class CalculaArea {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double num1, raizQuadrada, soma = 0;
        
        for(int i = 0; i<4; i++) {
            
            System.out.println("Informe um número: ");
            num1 = sc.nextInt();
            
            raizQuadrada = num1 * num1;
            soma += raizQuadrada;
        }
        
        System.out.println(soma);   
        
        
        
    }
    
}
