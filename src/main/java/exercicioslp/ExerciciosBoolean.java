package exercicioslp;

import java.util.Scanner;

public class ExerciciosBoolean {
    public static boolean ehPar(int numero) {
        boolean num = false;
        if (numero % 2 == 0) {
            num = true;
        }
        return num;

    }
    //assim já resolveria, pois a própria condição do if já retorna true ou false
    public static boolean ePar(int numero) {
        return numero % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = Integer.parseInt(leitor.nextLine());
        boolean resultado = ehPar(num);
        System.out.println("O número "+ num + " é par? " + resultado);


        leitor.close();
    }
}
