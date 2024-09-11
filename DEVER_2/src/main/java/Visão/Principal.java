package Visão;

import Modelo.Parede;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parede parede = new Parede();

        System.out.println("Digite a largura da parede em metros: ");
        parede.setLargura(scanner.nextDouble());

        System.out.println("Digite a altura da parede em metros: ");
        parede.setAltura(scanner.nextDouble());

        int latasNecessarias = parede.calcularLatasDeTinta();
        System.out.println("Você precisará de " + latasNecessarias + " lata(s) de tinta para pintar a parede.");

        scanner.close();
    }
}
