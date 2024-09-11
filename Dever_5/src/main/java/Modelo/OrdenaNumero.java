package Modelo;

import java.util.Arrays;

public class OrdenaNumero {

    private int[] numeros;

    public OrdenaNumero(int numero1, int numero2, int numero3) {
        numeros = new int[]{numero1, numero2, numero3};
    }

    public int[] ordenarEmOrdemCrescente() {
        Arrays.sort(numeros);
        return numeros;
    }
}
