package Ejercicios.src;

import java.util.Scanner;

public class Ej5 {

    public static void main (String[] args){

        double a = Math.PI;
        double at, ar, af;


        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el radio de la circunferencia");
        double b = input.nextDouble();

        System.out.println("Ingrese el area de la circunferencia");
        double c = input.nextDouble();

        at = (b * (a - c))/2;
        ar = b * c;
        af = at + ar;

        System.out.printf("El area de la figura es %5.2f",af);
    }
}