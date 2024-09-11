package Modelo;

public class ComparadorNumeros {
    private int numero1;
    private int numero2;
    private int numero3;

    public ComparadorNumeros(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int encontrarMaior() {
        int maior = numero1;
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        }
        return maior;
    }

    public int encontrarMenor() {
        int menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }
        return menor;
    }
}
