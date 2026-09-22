package Beecrowd;

import java.util.Scanner;

public class Programa1006 {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        double A, B, C, media;
        A = Double.parseDouble(leitor.nextLine());
        B = Double.parseDouble(leitor.nextLine());
        C = Double.parseDouble(leitor.nextLine());
        media = ((2*A) + (3*B) + (5*C)) / (2+3+5);
        System.out.printf("MEDIA = %.1f\n", media);
        leitor.close();
    }
}
