package exerciciosLP;

import java.util.Scanner;

public class ProgramaLojaDeRoupas {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas roupas você quer cadastrar?");
        int max = Integer.parseInt(leitor.nextLine());
        int [] codigosRoupas = new int[max];
        String [] descricoesRoupas = new String [max];
        int [] numeroDePecas = new int[max];
        for (int k=0; k<max; k++){
            System.out.println("Código da roupa:");
            codigosRoupas[k] = Integer.parseInt(leitor.nextLine());
            System.out.println("Descrição da roupa:");
            descricoesRoupas[k] = leitor.nextLine();
            System.out.println("Número de peças dessa roupa:");
            numeroDePecas[k] = Integer.parseInt(leitor.nextLine());
        }
        imprimirRoupasCadastradas(codigosRoupas, descricoesRoupas, numeroDePecas);
        System.out.println("Total de peças: "+ contaTotalDePecasDeRoupas(numeroDePecas));


        System.out.print("Nicho da peça (ex.: calça, saia, camisa): ");
        String prefixo = leitor.nextLine();
        imprimirRoupasComDescricaoComecandoCom(prefixo,descricoesRoupas);


        leitor.close();
    }

    public static void imprimirRoupasCadastradas(int [] codigos, String [] descricoes,
                                                 int [] quantidades){
        for (int k=0; k< codigos.length; k++){
            System.out.println("Código da roupa: "+ codigos[k] +", Descrição: "+ descricoes[k]+", Quantidade: "+ quantidades[k]);
        }

    }
    public static int contaTotalDePecasDeRoupas(int [] quantidadesPecas) {
        int totalDePecas = 0;
        for (int k =0; k < quantidadesPecas.length; k++){
            totalDePecas += quantidadesPecas[k];
        }
        return totalDePecas;
    }
    public static void imprimirRoupasComDescricaoComecandoCom(String prefixoDescricao, String [] descricoesPecas){
        boolean encontrou = false;
        for (int k = 0; k < descricoesPecas.length;k++){
            if (descricoesPecas[k].startsWith(prefixoDescricao)){
                System.out.println("Descrição:" + descricoesPecas[k]);
                encontrou = true;
            }
        }
        if (!encontrou){
            System.out.println("Nicho de roupa inválido");
        }
    }
}
