package Beecrowd;

import java.util.Scanner;

public class ProgramaTesteSelecao1035 {
    static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        int A, B, C, D;
        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();

        if (A % 2 == 0 && B > C && D > A
            && C > 0 && D > 0
            && C + D > A + B) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        leitor.close();
    }
}
