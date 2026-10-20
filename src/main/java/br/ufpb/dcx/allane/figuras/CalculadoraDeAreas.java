package br.ufpb.dcx.allane.figuras;

import java.util.ArrayList;

public class CalculadoraDeAreas {
    public static void main(String[] args){

        ArrayList <Figura> figuras = new ArrayList<>();
        figuras.add(new Triangulo(2, 1.3));
        figuras.add(new Quadrado(3));
        figuras.add(new Triangulo(1.5, 0.9));
        figuras.add(new Quadrado(2.3));
        figuras.add(new Triangulo(3.2, 1.2));

        double areaTotal = 0.0;
        for (Figura fig: figuras){
            double areaFigura = fig.calcularArea();
            String informacoesFigura = fig.toString();
            System.out.println(informacoesFigura);
            //System.out.println(areaFigura);

            areaTotal += areaFigura;
        }
        System.out.printf("\nÁrea total das figuras: %.1f\n", areaTotal);

    }
}
