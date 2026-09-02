package aulasLP;

import javax.swing.JOptionPane;

public class Aula02 {
    public static void main (String[] args){

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        System.out.println("aulasLP.Oi, "+ nome);

        String idadeString = JOptionPane.showInputDialog("Digite sua idade: ");
        int idade = Integer.parseInt(idadeString);
        String alturaStr = JOptionPane.showInputDialog("Digite sua altura: ");
        double altura = Double.parseDouble(alturaStr);

        System.out.println("Suas informações são, idade = "+ idade +" e altura = "+ altura);

    }
}
