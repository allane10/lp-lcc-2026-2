package Beecrowd;

import java.util.Scanner;

public class Programa1001A {
    public static void main (String[] args){

        Scanner leitor = new Scanner(System.in);
        //aqui a variável recebe em string e é convertida para inteiro
        int A = Integer.parseInt(leitor.nextLine());
        int B = Integer.parseInt(leitor.nextLine());
        int X = A + B;
        System.out.printf("X = %d\n", X);
        leitor.close();
    }
}
