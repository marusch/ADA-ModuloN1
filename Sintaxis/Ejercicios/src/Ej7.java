package Ejercicios.src;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args){

        int l, pg;
        double tg, ga;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de litros");
        l = input.nextInt();

        System.out.println("Ingrese el precio del galon");
        pg = input.nextInt();

        tg = l / 3.785;
        ga = pg * tg;

        System.out.printf("La ganancia por leche entregada es %5.2f",ga);
    }

}