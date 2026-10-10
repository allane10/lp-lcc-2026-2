package br.ufpb.dcx.allane.ProgramaDescontos;
import java.util.Scanner;

public class ProgramaDescontos {

    public static double calculaValorComDesconto(double valorProduto){
        if (valorProduto < 50){
            return (valorProduto);
        } else if (valorProduto < 100){
            return (valorProduto - (valorProduto*0.05));
            //5% de desconto se valor entre 50 e 100 (sem incluir 100)
        } else {
            return (valorProduto - (valorProduto*0.10));
            //10% de desconto
        }
    }

    public static double calculaSomatorioDescontos(Produto [] produtos) {
        double somatorioDescontos = 0;

        for (int i = 0; i < produtos.length; i++) {
            double descontoPorProduto = 0;
            if (produtos[i].getPreco() < 50) {
                descontoPorProduto += 0;

            } else if (produtos[i].getPreco() < 100) {
                descontoPorProduto += (produtos[i].getPreco()) * 5 / 100;
            } else {
                descontoPorProduto += (produtos[i].getPreco()) * 10 / 100;
            }
            somatorioDescontos += descontoPorProduto;
        }
        return somatorioDescontos;
    }

    public static String verificarProdutoComMaiorDesconto(Produto[] produtos){
        double maiorDesconto = 0;
        String nomeProdutoMaiorDesconto = "";
        for(int i =0; i < produtos.length; i++){
            double desconto = 0;
            if(produtos[i].getPreco() < 50){
                desconto = 0;
            } else if (produtos[i].getPreco() < 100){
                desconto = produtos[i].getPreco() * 5/100;
            } else {
                desconto = produtos[i].getPreco() * 10/100;
            }
            if (desconto > maiorDesconto) {
                maiorDesconto = desconto;
                nomeProdutoMaiorDesconto = produtos[i].getNome();
            }
        }
        return nomeProdutoMaiorDesconto;
    }

    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());
        Produto [] produtos = new Produto [quant];
        for (int k=0; k<quant; k++){
            Produto p = new Produto();
            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));
            double valorComDesconto = calculaValorComDesconto(p.getPreco());
            System.out.printf(
                    "O valor a pagar pelo produto é R$ %.2f\n",valorComDesconto);
            produtos[k] = p;
        }
        System.out.println("Produto com maior desconto: " + verificarProdutoComMaiorDesconto(produtos));
        System.out.println("Somatório dos descontos: "+ calculaSomatorioDescontos(produtos));

        leitor.close();

    }
}


