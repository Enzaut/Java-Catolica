package Visão;

import Modelo.OrdenaNumero;
import javax.swing.JOptionPane;

public class PrintOrdem {

    public static void main(String[] args) {
        // Coletando os números usando JOptionPane
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número:"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número:"));

        // Criando uma instância de OrdenadorNumeros
        OrdenaNumero ordenador = new OrdenaNumero(numero1, numero2, numero3);
        
        // Obtendo os números em ordem crescente
        int[] numerosOrdenados = ordenador.ordenarEmOrdemCrescente();

        // Exibindo os resultados usando JOptionPane
        JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: "
            + numerosOrdenados[0] + ", " 
            + numerosOrdenados[1] + ", " 
            + numerosOrdenados[2]);
    }
}
