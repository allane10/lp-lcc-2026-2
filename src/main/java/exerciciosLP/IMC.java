package exerciciosLP;

import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Digite seu nome");

        String pesoString = JOptionPane.showInputDialog("Digite seu peso");
        //transformando a string para ser double
        double peso = Double.parseDouble(pesoString);

        String alturaStr = JOptionPane.showInputDialog("Digite sua altura");
        double altura = Double.parseDouble(alturaStr);

        double imc = peso / (altura * altura);
        String resultadoImcFormatado = "%.2f".formatted(imc);

        JOptionPane.showMessageDialog(null, nome + ", seu imc é de: " + resultadoImcFormatado);
    }
}
