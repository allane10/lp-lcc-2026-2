package exerciciosLP;

import javax.swing.JOptionPane;

public class CalculoMedia {
    public static void main(String[] args){

        String nota1Str = JOptionPane.showInputDialog("Digite a nota 1: ");
        String nota2Str = JOptionPane.showInputDialog("Digite a nota 2: ");
        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);
        double media = (nota1 + nota2) / 2;

        String resultadoMediaFormatado = "%.1f".formatted(media);

        System.out.println("A média é: "+ resultadoMediaFormatado);
    }
}

