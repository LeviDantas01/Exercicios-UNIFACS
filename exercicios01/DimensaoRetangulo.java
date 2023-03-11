/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17
 * 5) Ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
 * 
 */
public class DimensaoRetangulo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double base, altura, area;
        
        System.out.print("Infome a base: ");
        base = sc.nextDouble();
        
        System.out.print("Informe a altura: ");
        altura = sc.nextDouble();
        
        area = base * altura;
        
        System.out.printf("A área é: %s \n", area);
        
    }
    
}
