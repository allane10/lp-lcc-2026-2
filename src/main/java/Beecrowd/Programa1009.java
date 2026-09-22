package Beecrowd;

import java.util.Scanner;

public class Programa1009 {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        double salarioFixo = Double.parseDouble(leitor.nextLine());
        double totalDeVendas = Double.parseDouble(leitor.nextLine());
        double totalAReceber = salarioFixo + (totalDeVendas * 15/100);
        System.out.printf("TOTAL = R$ %.2f\n", totalAReceber);
        leitor.close();
    }
}
