package Beecrowd;

import java.util.Scanner;

public class ProgramaNumeroPrimo1165 {
    public static void main (String[] args){

        Scanner leitor = new Scanner(System.in);
        int fixo = 2;
        double somatorio = 0;
        for (int k = 0; k < fixo; k++){
            int codigoPeca = leitor.nextInt();
            int numPecas = leitor.nextInt();
            double valorUniPeca = leitor.nextDouble();
            double valorPorPeca = numPecas*valorUniPeca;
            somatorio += valorPorPeca;
        }
        leitor.close();
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", somatorio);
    }
}
