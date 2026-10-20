package br.ufpb.dcx.allane.figuras;

public class Triangulo implements Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return (this.base * this.altura)/2;
    }
    public double getBase(){
        return this.base;
    }
    public void setBase(double novaBase){
        this.base = novaBase;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double novaAltura){
        this.altura = novaAltura;
    }
    public String toString(){
        return "Triângulo de base " + this.base + " e altura " +
                this.altura + " tem área igual a " + String.format("%.1f",this.calcularArea());
    }
}
