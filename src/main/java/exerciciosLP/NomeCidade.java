package exerciciosLP;

import javax.swing.JOptionPane;

public class NomeCidade {
    public static void main (String[] args){

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String cidadeNascimento = JOptionPane.showInputDialog("Digite a cidade que nasceu: ");

        System.out.println("Oi, "+ nome +"! Que legal saber que você é da cidade "+ cidadeNascimento +".");
    }
}
