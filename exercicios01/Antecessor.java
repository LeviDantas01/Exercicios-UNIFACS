/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17
 * 4) Ler um valor inteiro e exibir seu antecessor.
 */
public class Antecessor {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Informe um número: ");
        num = sc.nextInt();
        
        num -= 1;
        
        System.out.printf("O antecessor é %s \n", num);
    }
    
}
