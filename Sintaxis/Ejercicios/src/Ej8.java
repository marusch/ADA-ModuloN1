package Ejercicios.src;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args){

        int x, x1, x2, y, y1, y2;
        double d;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el valor del principio del punto, y el valor del final de su recorrido.");
        x1 = input.nextInt();
        x2 = input.nextInt();

        System.out.println("Ingrese el valor del principio de la ordenada, y el valor de su final");
        y1 = input.nextInt();
        y2 = input.nextInt();

        x = x1 + x2;
        y = y1 + y2;
        d = Math.sqrt(x * x + y * y);

        System.out.printf("La diferencia entre puntos es %5.2f",d);
    }
}