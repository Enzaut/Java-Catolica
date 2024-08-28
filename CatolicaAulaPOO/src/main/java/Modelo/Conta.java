package Modelo;


public class Conta {
   private int numero;
   private String titular;
   private double saldo;
   private double limite;

   
   //metodo sacar
   public boolean sacar(double valorSaque){
       if(this.saldo<valorSaque){
           System.out.println("Valor do saque maior que o saldo.");
           return false;
       }else{
           double novoSaldo=saldo-valorSaque;
           saldo=novoSaldo;
           return true;
       }
   }
   
   //Metodo depositar
   public void depositar(double valorDeposito){
       double novoSaldo = saldo+valorDeposito;
       saldo = novoSaldo;
   }
   
    /** @return the numero */
    public int getNumero() {
        return numero;
    }

    /** @param numero the numero to set*/
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /** @return the titular*/
    public String getTitular() {
        return titular;
    }

    /**@param titular the titular to set*/
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**@return the saldo*/
    public double getSaldo() {
        return saldo;
    }

    /**@param saldo the saldo to set*/
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }
   
   
}
