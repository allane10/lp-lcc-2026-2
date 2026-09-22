package exerciciosLP;
import java.util.Scanner;
public class Advinha {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maxNum = 100;
        int pontos = 100;
        int y = sorteiaNumeroInteiro(maxNum);
        boolean acertou = false;
        int tentativas = 0;
        while(!acertou) {
            System.out.println("Tente adivinhar y [0-100]:");
            int numLido = Integer.parseInt(leitor.nextLine());
            tentativas++;
            if (numLido == y) {
                System.out.println("Parabéns! Você acertou. Número de tentativas:"+tentativas);
                System.out.println("Pontuação final: "+ pontos);
                acertou = true;
            } else {
                System.out.println("Errou, perdeu 2 pontos! Tente novamente");
                pontos -= 2;
                if (numLido < y){
                    System.out.println("Valor digitado menor que o número sorteado.");

                }else {
                    System.out.println("Valor digitado maior que o número sorteado.");
                }
                System.out.println("Sua pontuação agora é de: "+ pontos);
            }
        }
            leitor.close();
    }
    public static int sorteiaNumeroInteiro(int maximo) {
        int x = (int) (Math.random()*(maximo+1)); //gera número inteiro aleatório entre [0-maximo]
        return x;
    }
}
