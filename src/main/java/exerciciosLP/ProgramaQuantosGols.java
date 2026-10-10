package exerciciosLP;

import java.util.Scanner;

public class ProgramaQuantosGols {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        int num = 10;
        int [] golsPorJogo = new int[num];
        int menorNumGols = Integer.MAX_VALUE;
        int totalDeGols = 0;
        System.out.println("Digite o número de gols do time em cada um dos 10 jogos: ");

        for(int k = 0; k < golsPorJogo.length; k++){
            int gols = Integer.parseInt(leitor.nextLine());
            golsPorJogo[k] = gols;
            if(golsPorJogo[k]< menorNumGols){
                menorNumGols = golsPorJogo[k];
            }
            totalDeGols += golsPorJogo[k];
        }
        System.out.println("Menor número de gols: "+ menorNumGols);
        System.out.println("Total de gols: "+ totalDeGols);

        //ou
        /*for(int i = 0; i<num; i++){
            System.out.println("Digite o número de gols do time em cada um dos 10 jogos: ");
            int gol = 0;
            if(gol<menorNumGols){
                menorNumGols = gol;

            }
            totalDeGols += gol;
        }*/
        leitor.close();

    }
}

