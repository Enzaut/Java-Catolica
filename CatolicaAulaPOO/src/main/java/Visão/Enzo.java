package Visão;


import Modelo.Conta;

public class Enzo {

    public static void main(String[] args) {
        Conta pedro = new Conta();
        pedro.setTitular("Pedro");
        pedro.setNumero(203040);
        pedro.setSaldo(15000);
        pedro.setLimite(50000);
        System.out.println("Saldo anterior: "
                +pedro.getTitular()+"\n"
                +pedro.getSaldo());
        
        pedro.sacar(80000);
        System.out.println("Saldo posterior: "
                +pedro.getTitular()+"\n"
                +pedro.getSaldo());
        
        //Realizar um depósito
        Conta paulo = new Conta();
        paulo.setTitular("Paulo");
        paulo.setSaldo(30000);
        System.out.println("Saldo anterior: "
                +paulo.getTitular()+"\n"
                +paulo.getSaldo());
        
        paulo.depositar(10000);
        System.out.println("Saldo posterior: "
                +paulo.getTitular()+"\n"
                +paulo.getSaldo());
        
        
    }
}

