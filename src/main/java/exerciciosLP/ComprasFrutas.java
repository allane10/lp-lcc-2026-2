package exerciciosLP;

import javax.swing.*;

public class ComprasFrutas {
    public static void main(String[] args){

        int quantMacas = Integer.parseInt(JOptionPane.showInputDialog("Quantas maçãs? "));
        int quantMamoes = Integer.parseInt(JOptionPane.showInputDialog("Quantos mamões? "));

        double valorPagar = quantMacas * 1.00 + quantMamoes * 3.50;
        JOptionPane.showMessageDialog(null, "Você pagará R$ " + valorPagar);

    }
}
