package Visão;

import Modelo.CalculadoraNota;
import java.util.Scanner;

public class PrintNota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota:");
        double nota4 = scanner.nextDouble();

        CalculadoraNota calculadora = new CalculadoraNota(nota1, nota2, nota3, nota4);
        double media = calculadora.calcularMedia();

        System.out.printf("A média das notas é: %.2f%n", media);
    }
}
