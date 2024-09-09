package edu.mx.uttt.iterativos;

public class Potencia {
    private int base;
    private int exponente;

    public Potencia(int base, int exponente) {
        this.base = base;
        this.exponente = exponente;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public int calcularConFor() {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}