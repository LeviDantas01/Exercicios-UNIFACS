/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17 8)Ler o número total de eleitores de um município, o número de
 * votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um
 * representa em relação ao total de eleitores.
 *
 */
public class totalVotos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalVotos, votosNulos, votosBrancos, votosValidos;
        double percVotosValidos, percVotosBrancos, percVotosNulos;

        System.out.print("Informe a quantidade de votos validos: ");
        votosValidos = sc.nextInt();

        System.out.print("Informe a quantidade de votos brancos: ");
        votosBrancos = sc.nextInt();

        System.out.print("Informe a quantidade de votos nulos: ");
        votosNulos = sc.nextInt();

        totalVotos = votosValidos + votosBrancos + votosNulos;

        percVotosValidos = 100 * votosValidos / totalVotos;
        percVotosBrancos = 100 * votosBrancos / totalVotos;
        percVotosNulos = 100 * votosNulos / totalVotos;
        
        System.out.printf(" O total de Votos foram: %s\n Percentual de votos validos: %s\n Percentual de votos Nulos: %s\n Percentual de votos Brancos",
                totalVotos, percVotosValidos, percVotosNulos, percVotosBrancos);

    }

}
