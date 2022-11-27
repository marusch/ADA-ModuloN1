package Ejercicios.src;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args){
        int r, h;
        double c, at, ac, area, pi = Math.PI;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la base del triangulo rectangulo");
        r = input.nextInt();

        System.out.println("Ingrese la hipotenusa del triangulo rectangulo");
        h = input.nextInt();

        c = Math.sqrt(h * h - r * r);
        at = 2 * (r * c) / 2;
        ac = (Math.PI * r * r) / 2;
        area = at + ac;

        System.out.printf("El area de la figura es %5.2f",area);
    }
}