package br.ufpb.dcx.allane.Restaurante;

import java.util.Scanner;

public class ProgramaRestaurante {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos refeições serão realizadas do tipo ALMOÇO? ");
        int N = Integer.parseInt(leitor.nextLine());
        double totalAlmocos = 0;
        int cont = 0;
        while (cont < N){
            System.out.println("Digite o valor do " + (cont+1) + "º almoço: ");
            double valorDoAlmoco = Double.parseDouble(leitor.nextLine());
            totalAlmocos += valorDoAlmoco;
            cont++;
        }
        System.out.printf("Total gasto com almoços R$ %.2f",totalAlmocos);



    }

}



        /*Refeicao [] refeicoes = new Refeicao[N];
        for (int k = 0; k< refeicoes.length; k++){
            System.out.println("Valor do " + (k+1) + "º almoço:");
            double valorRefeicao = Double.parseDouble(leitor.nextLine());
            refeicoes[k] = new Refeicao("ALMOÇO", valorRefeicao);
        }
        double totalAlmocos = valorTotalAlmocos(refeicoes);
        System.out.printf("Total gasto pelo Restaurante com almoços R$ %.2f", totalAlmocos);

        leitor.close();

    }
    public static double valorTotalAlmocos(Refeicao [] refeicoes){
        double valorTotal = 0;
        int i = 0;
        while (i < refeicoes.length){
            valorTotal += refeicoes[i].getValorRefeicao();
            i++;
        }
        return valorTotal;
    }
} */
