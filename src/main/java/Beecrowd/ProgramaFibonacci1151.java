package Beecrowd;

import java.util.Scanner;

public class ProgramaFibonacci1151 {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);

        int N = Integer.parseInt(leitor.nextLine());
        int inicial = 0;
        int inicial2 = 1;

        if (N > 0 && N < 46){
            if (N == 1){
                System.out.println(inicial);
            } else if (N == 2) {
                System.out.printf("%d %d\n", inicial, inicial2);
            } else {
                System.out.printf("%d %d", inicial, inicial2);
                N = N - 2;
                for (int k = 0; k < N; k++){
                    int numSucessor = inicial + inicial2;
                    System.out.printf(" %d", numSucessor);
                    inicial = inicial2;
                    inicial2 = numSucessor;
                }
                System.out.println();
            }
        }
        leitor.close();
    }
}
