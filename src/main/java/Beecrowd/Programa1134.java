package Beecrowd;

import java.util.Scanner;

public class Programa1134 {
    public static void main (String [] args) {
        Scanner leitor = new Scanner(System.in);

        int contAlcool, contGasolina, contDiesel;
        contAlcool = 0;
        contGasolina = 0;
        contDiesel = 0;

        int numero;
        do {
            numero = Integer.parseInt(leitor.nextLine());
            if (numero == 1){
                contAlcool++;
            } else if (numero == 2) {
                contGasolina ++;
            } else if (numero == 3) {
                contDiesel ++;
            }
        }while (numero != 4);
        System.out.printf("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d\n",
                contAlcool, contGasolina, contDiesel);
        leitor.close();
    }
}
