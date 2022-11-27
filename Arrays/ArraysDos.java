import java.util.Scanner;

public class ArraysDos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Matriz dinamica

     /*  int filas=0, columnas=0, contador=1;

        System.out.println("¿Cuantas filas desea?");
        filas = input.nextInt();

        System.out.println("¿Cuantas columnas desea?");
        columnas = input.nextInt();

        int numeros[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j] = contador;
                contador++;
                System.out.print("[ " + numeros[i][j] + " ]");
            }
            System.out.println("");
        }
    */

//-------------------------------------------------------------------------------------
       
	 //Ejercicio 2 de vectores

        int n =2;
        int[] arregloA = new int[n];
        int[] arregloB = new int[n];
        int[] arregloC = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero para el Array A");
            arregloA[i] = input.nextInt();
            System.out.println("Ingrese el numero para el Array B");
            arregloB[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arregloC[i] = arregloA[i] + arregloB[i];
        }

        System.out.println("El valor del arreglo C es : ");

        for (int i = 0; i < n; i++) {
            System.out.println("[ " +  arregloC[i] + " ]");
        }
    }
}