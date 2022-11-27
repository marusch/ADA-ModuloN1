package Ejercicios.src;
import java.util.Scanner;

 public class Ej2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Ejercicio2

        int notaUno = 0, notaDos = 0, notaTres = 0, notaCuatro = 0, suma = 0, promedio = 0;

        System.out.println("Dame la primer nota");
        notaUno = in.nextInt();

        System.out.println("Dame la segunda nota");
        notaDos = in.nextInt();

        System.out.println("Dame la tercer nota");
        notaTres = in.nextInt();

        System.out.println("Dame la cuarta nota");
        notaCuatro = in.nextInt();

        suma = notaUno + notaDos + notaTres + notaCuatro;

        promedio = suma / 4;

        System.out.println("El final del alumno es: " + promedio);
    }
}