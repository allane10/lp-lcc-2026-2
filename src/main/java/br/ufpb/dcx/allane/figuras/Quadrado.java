package br.ufpb.dcx.allane.figuras;

public class Quadrado implements Figura{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    public double calcularArea(){
        return this.lado * this.lado;
    }
    public double getLado() {
        return this.lado;
    }
    public void setLado(double novoLado){
        this.lado = novoLado;
    }
    public String toString(){
        return "Quadrado de lado " + this.lado + " tem área igual a " + String.format("%.1f",this.calcularArea());
    }
}
