package exerciciosLP;

import java.util.Scanner;

public class ProgramaCampeonatoDeFutebol {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos jogos aconteceram no campeonato?");
        int quantJogos = Integer.parseInt(leitor.nextLine());
        String [] timesJogando = new String [quantJogos];
        String [] placaresDosJogos = new String[quantJogos];
        int k = 0;
        while(k<quantJogos){
            System.out.println("Quais os times jogando?");
            timesJogando[k] = leitor.nextLine();
            System.out.println("Qual o placar do jogo?");
            placaresDosJogos[k] = leitor.nextLine();
            k++;
        }
        imprimirJogos(timesJogando, placaresDosJogos);
        int jogosSemGols = contaTotalDeJogosSemGols(placaresDosJogos);
        System.out.println("Total de jogos sem gols: " + jogosSemGols);
        System.out.println("Digite o nome do time que deseja pesquisar para obter os jogos referente a ele: ");
        String nomeTimePesquisar = leitor.nextLine();
        imprimirJogosComTime(nomeTimePesquisar, timesJogando, placaresDosJogos);
        leitor.close();
    }


    public static void imprimirJogos(String [] timesJogando, String [] placaresDosJogos){
        for (int k = 0; k< timesJogando.length; k++){
            System.out.println("Jogo: " + timesJogando[k]+", Placar: "+ placaresDosJogos[k]);
        }
    }
    public static int contaTotalDeJogosSemGols(String [] placares){
        int quantTotalSemGols = 0;
        for(int k =0; k<placares.length; k++){
            if(placares[k].equals("0x0")){
                quantTotalSemGols += 1;
            }
        }
        return quantTotalSemGols;
    }
    public static void imprimirJogosComTime (String nomeTimePesquisado, String [] timesJogando, String [] placaresJogos){
        System.out.println("Time pesquisado: "+ nomeTimePesquisado);
        for(int i = 0; i < timesJogando.length; i++){
            if(timesJogando[i].startsWith(nomeTimePesquisado) || timesJogando[i].endsWith(nomeTimePesquisado)){
                System.out.println("Jogo "+ timesJogando[i] + ", placar: " + placaresJogos[i]);

            }
        }
    }


}
