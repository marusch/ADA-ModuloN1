package Ejercicios.src;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in); //Libreria Scanner - Ingresar datos de teclado

        int numUno=0, numDos=0, resultado=0;

        System.out.println("Dame el primer valor");
        numUno= in.nextInt();

        System.out.println("Dame el segundo valor");
        numDos= in.nextInt();

        resultado= numUno + numDos;

        System.out.println("El total de la suma es: " + resultado);

    }
}