package Beecrowd;

import java.util.Scanner;

public class Programa1074 {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        int N = Integer.parseInt(leitor.nextLine());

        for (int k=1; k <= N; k++){
            int num = Integer.parseInt(leitor.nextLine());
            if (num == 0){
                System.out.println("NULL");
            } else if (num % 2 == 0) {
                if (num > 0){
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else {
                if (num > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
        leitor.close();
    }
}
