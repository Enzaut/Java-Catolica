package Modelo;

public class Parede {
    private double largura;
    private double altura;
    private final double CONSUMO_TINTA = 0.3; // 300 ml por metro quadrado
    private final double CAPACIDADE_LATA = 2.0; // 2 litros por lata

    // Getters e Setters
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular a quantidade de latas de tinta
    public int calcularLatasDeTinta() {
        double area = largura * altura;
        double consumoTotal = area * CONSUMO_TINTA;
        int latasNecessarias = (int) Math.ceil(consumoTotal / CAPACIDADE_LATA);
        return latasNecessarias;
    }
}
