package Ejercicios.src;

import java.util.Scanner;

public class Ej9 {

    public static void main(String [] args){

        int ph,ht,ss;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas");
        ht = input.nextInt();

        System.out.println("Ingrese el pago por hora");
        ph = input.nextInt();

        ss = ht * ph;

        System.out.println("El sueldo semanal es " + ss);
    }
}