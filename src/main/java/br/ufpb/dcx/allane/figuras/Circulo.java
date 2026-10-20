package br.ufpb.dcx.allane.figuras;

public class Circulo implements Figura{

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public Circulo(){
        this(0.0);
    }
    public double calcularArea(){
        return Math.PI * this.raio * this.raio;
    }
    public double getRaio(){
        return this.raio;
    }
    public void setRaio(double novoRaio){
        this.raio = novoRaio;
    }
    public String toString(){
        return "Círculo de raio " + this.raio + " e área " +
                this.calcularArea();
    }
}
