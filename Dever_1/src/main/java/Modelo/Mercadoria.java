package Modelo;

public class Mercadoria {
    private double custo;
    private double frete;
    private double despesas;
    private double venda;

    // Método para calcular o valor bruto
    public double calcularValorBruto() {
        return custo + frete + despesas;
    }

    // Método para calcular o lucro
    public double calcularLucro() {
        return venda - calcularValorBruto();
    }

    // Método para calcular o percentual de lucro
    public double calcularPercentualLucro() {
        double valorBruto = calcularValorBruto();
        double lucro = calcularLucro();
        return (valorBruto > 0) ? (lucro / valorBruto) * 100 : 0;
    }

    // Getters e Setters
    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }
}
