package Ejercicios.src;

import java.util.Scanner;

public class Ej10 {

    public static void main(String [] args){

        double pg;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese medida en centimetros");
        int cm = input.nextInt();

        pg = cm / 0.0254;

        System.out.printf("La medida en pulgada en pulgada es %5.2f",pg);
    }
}
