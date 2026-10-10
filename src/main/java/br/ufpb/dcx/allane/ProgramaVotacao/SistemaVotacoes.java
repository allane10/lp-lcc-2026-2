package br.ufpb.dcx.allane.ProgramaVotacao;

import java.util.Scanner;

public class SistemaVotacoes {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pessoas vão votar?");
        int numVotantes = Integer.parseInt(leitor.nextLine());
        Voto [] votos = new Voto[numVotantes];
        for (int k =0; k< votos.length; k++){
            System.out.println("Qual o seu código de votante?");
            String codigo = leitor.nextLine();
            System.out.println("Qual o seu voto? 1. Chapa vamos vencer;"+
                    " 2. Chapa É isso aí; 3. Chapa vamos construir");
            int numeroChapa = Integer.parseInt(leitor.nextLine());
            votos[k] = new Voto(codigo, numeroChapa);
        }
        imprimeResultadoVotacao(votos);
        leitor.close();
    }

    public static void imprimeResultadoVotacao(Voto [] votos){
        System.out.println("Resultado da votação:");
        int votosChapa1 = 0;
        int votosChapa2 = 0;
        int votosChapa3 = 0;
        int votosNulos = 0;
        int i = 0;
        do{
            if (votos[i].getNumeroChapa() == 1){
                votosChapa1 +=1;
            }else if (votos[i].getNumeroChapa() == 2){
                votosChapa2 +=1;
            }else if (votos[i].getNumeroChapa() == 3){
                votosChapa3 +=1;
            }else{
                votosNulos +=1;
            }
            i+=1;
        } while (i< votos.length);
        System.out.println("Votos chapa 1: "+votosChapa1);
        System.out.println("Votos chapa 2: "+votosChapa2);
        System.out.println("Votos chapa 3: "+votosChapa3);
        System.out.println("Votos Nulos: "+votosNulos);
    }

    public static int qualChapaTemMaisVotos(Voto [] votos){
        int chapaMaisVotada = 0;
        int chapa1 = 0;
        int chapa2 = 0;
        int chapa3 = 0;
        for (int j = 0; j < votos.length; j++){
            if(votos[j].getNumeroChapa() == 1){
                chapa1 += 1;
            } else if (votos[j].getNumeroChapa() == 2) {
                chapa2 += 1;
            } else if (votos[j].getNumeroChapa() == 3) {
                chapa3 += 1;
            }
        }

        if (chapa1 > chapa2 && chapa1 > chapa3){
            chapaMaisVotada = 1;
        } else if (chapa2 > chapa1 && chapa2 > chapa3){
            chapaMaisVotada = 2;
        } else if (chapa3 > chapa1 && chapa3 > chapa2){
            chapaMaisVotada = 3;
        } else {
            chapaMaisVotada = -1;
        }

        return chapaMaisVotada;
    }

}
