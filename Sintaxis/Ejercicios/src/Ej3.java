package Ejercicios.src;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Ejercicio3

        int A = 0, B = 0, area = 0;

        System.out.println("Dame el valor de la altura");
        A = in.nextInt();

        System.out.println("Dame el valor de la base");
        B = in.nextInt();

        area = B * A;

        System.out.println("El resultado del area es: " + area);
    }
}