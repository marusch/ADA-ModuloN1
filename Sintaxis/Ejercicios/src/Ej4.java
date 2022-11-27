package Ejercicios.src;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        int area;
        double pi = Math.PI;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el radio");
        int radio = input.nextInt();

        area = (int) (pi * (radio * 2));

        System.out.printf("El area de la circunferencia es %d",area);
    }
}