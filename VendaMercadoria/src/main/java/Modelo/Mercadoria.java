package Modelo;


public class Mercadoria {
    private double custo;
    private double frete;
    private double despesas;
    private double venda;
    
   

  
    /*percentual do lucro
    perlucro=lucro/valorbruto*100
    */
    public void valorBruto(double custo, double frete, double despesas){
        double valor=custo+frete+despesas;
        System.out.println("O valor bruto do produto: "+valor);
    }
    
    public void valorLucro(double valorBruto, double venda){
      double lucro = valorBruto - venda;
      System.out.println("O lucro do produto: "+lucro);
    }
    
    public void percentualLucro(double valorLucro, double valorBruto){
        double percentual = (valorLucro/valorBruto)*100;
        System.out.println("O percentual do lucro: "+percentual);
    }
       
    /**
     * @return the custo
     */
    public double getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

    /**
     * @return the frete
     */
    public double getFrete() {
        return frete;
    }

    /**
     * @param frete the frete to set
     */
    public void setFrete(double frete) {
        this.frete = frete;
    }

    /**
     * @return the despesas
     */
    public double getDespesas() {
        return despesas;
    }

    /**
     * @param despesas the despesas to set
     */
    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    /**
     * @return the venda
     */
    public double getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(double venda) {
        this.venda = venda;
    }
    
    
}
