package br.ufpb.dcx.allane.restauranteuniversitario;

import java.util.Scanner;

public class ProgramaRefeicao {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas refeições foram servidas hoje?");
        int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
        RefeicaoRealizada [] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];
        for (int k = 0; k<refeicoes.length; k++) {
            System.out.println("Matrícula do(a) aluno(a)[" + (k + 1) + "]");
            String matricula = leitor.nextLine();
            System.out.println("Qual o tipo de reição? CAFÉ, ALMOÇO ou JANTAR");
            String tipoRefeicao = leitor.nextLine();
            refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
            System.out.printf("%s\n", refeicoes[k].toString());
        }
        // questão 2, letra a e b, chamando os métodos no main
        int quantRefeicao = calculoQuantRefeicao(refeicoes, "ALMOÇO");
        System.out.println("Quantidade de refeições do tipo ALMOÇO: "+ quantRefeicao);
        String refeicaoEscolhida = "CAFÉ";
        System.out.println("A refeição " + refeicaoEscolhida + " foi realizada: ");
        verificacaoRefeicao(refeicoes, refeicaoEscolhida);
        System.out.println("FIM DO PROGRAMA");

        leitor.close();
    }
    //LETRA A, da questão 2
    public static int calculoQuantRefeicao(RefeicaoRealizada [] refeicoes, String tipoRefeicao){
        int quantRefeicaoescolhida = 0;
        for(int i = 0; i<refeicoes.length; i++){
            if(refeicoes[i].getTipoRefeicao().equalsIgnoreCase(tipoRefeicao)){
                quantRefeicaoescolhida++;
            }
        }
        return quantRefeicaoescolhida;
    }
    // LETRA B, da questão 2
    public static void verificacaoRefeicao(RefeicaoRealizada [] refeicoes, String refeicaoEscolhida){
        String houveRefeicao = "NÃO";
        for (int k = 0; k < refeicoes.length; k++){
            if (refeicoes[k].getTipoRefeicao().equalsIgnoreCase(refeicaoEscolhida)){
                houveRefeicao = "SIM";
                break;
            }
        }
        System.out.println(houveRefeicao);
    }
}
