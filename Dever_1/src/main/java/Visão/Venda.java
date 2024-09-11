package Visão;

import Modelo.Mercadoria;
import javax.swing.JOptionPane;

public class Venda {

    public static void main(String[] args) {
        Mercadoria produto = new Mercadoria();
        
        // Coleta de dados do usuário
        double custo = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Digite o valor do custo do produto:"));
        double frete = Double.parseDouble(JOptionPane.showInputDialog 
        (null, "Digite o valor do frete da mercadoria:"));
        double despesas = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Digite o valor das despesas da mercadoria:"));
        double venda = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Digite o valor da venda da mercadoria:"));
        
        
        produto.setCusto(custo);
        produto.setFrete(frete);
        produto.setDespesas(despesas);
        produto.setVenda(venda);
        
        // Calcula valores
        double valorBruto = produto.calcularValorBruto();
        double lucro = produto.calcularLucro();
        double percentualLucro = produto.calcularPercentualLucro();
        
        
        JOptionPane.showMessageDialog
        (null, "O valor bruto do produto é: " + valorBruto);
        JOptionPane.showMessageDialog
        (null, "O lucro do produto é: " + lucro);
        JOptionPane.showMessageDialog
        (null, "O percentual de lucro é: " + percentualLucro + "%");
    }
}
