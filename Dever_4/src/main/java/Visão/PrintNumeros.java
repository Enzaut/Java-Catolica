package Visão;

import Modelo.ComparadorNumeros;
import javax.swing.JOptionPane;

public class PrintNumeros {

    public static void main(String[] args) {
        // Coletando os números usando JOptionPane
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número:"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número:"));

        // Criando uma instância de ComparadorNumeros
        ComparadorNumeros comparador = new ComparadorNumeros(numero1, numero2, numero3);
        
        // Encontrando o maior e o menor número
        int maior = comparador.encontrarMaior();
        int menor = comparador.encontrarMenor();

        // Exibindo os resultados usando JOptionPane
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
        JOptionPane.showMessageDialog(null, "O menor número é: " + menor);
    }
}
