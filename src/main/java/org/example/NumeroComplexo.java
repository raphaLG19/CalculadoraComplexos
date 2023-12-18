package org.example;

public class NumeroComplexo {
    private double real;
    private double imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public NumeroComplexo adiciona(NumeroComplexo outro) {
        this.real += outro.real;
        this.imaginario += outro.imaginario;
        return outro;
    }

    public void subtrai(NumeroComplexo outro) {
        this.real -= outro.real;
        this.imaginario -= outro.imaginario;
    }

    public double modulo() {
        return Math.sqrt(real * real + imaginario * imaginario);
    }

    @Override
    public String toString() {
        return real + "+" + imaginario + "i";
    }

}
