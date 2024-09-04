package Visão;

import Modelo.Mercadoria;
import javax.swing.JOptionPane;

public class Venda {

    public static void main(String[] args) {
        Mercadoria produto = new Mercadoria();
        
        //custo mercadoria
        produto.setCusto(Double.parseDouble
        (JOptionPane.showInputDialog(null,"Digite o valor do produto.")));
        
        //Frete da mercadoria
        produto.setFrete(Double.parseDouble
        (JOptionPane.showInputDialog
        (null,"Digite o valor do frete da mercadoria.")));
        
        //Despesas da mercadoria
        produto.setDespesas(Double.parseDouble
        (JOptionPane.showInputDialog
        (null,"Digite o valor da  despesa da mercadoria.")));
        
        //Venda da Mercadoria
        produto.setVenda(Double.parseDouble
        (JOptionPane.showInputDialog
        (null,"Digite o valor da venda da mercadoria.")));
        
        produto.valorBruto(produto.getCusto(), produto.getFrete(), produto.getDespesas());
        
        produto.percentualLucro(produto.valorBruto(produto.getCusto(), produto.getFrete(),
                produto.getDespesas()), produto.valorLucro(double valorLucro, double venda));
    }
}
