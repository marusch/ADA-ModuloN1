package Ejercicios.src;

import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args){

        int l, a, n, cm, v;
        double pag;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese altura, ancho, y largo de la alberca");
        a = input.nextInt();
        n = input.nextInt();
        l = input.nextInt();

        System.out.println("Ingrese el costo del metro cubico");
        cm = input.nextInt();

        v = (a * l * n);
        pag = v * cm;

        System.out.printf("El pago a realizar por el consumo es ",pag);
    }
}