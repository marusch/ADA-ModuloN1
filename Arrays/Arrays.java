import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

       //Declaracion directa de un vector

      /*  int[] vector = new int[3];

        vector[0] = 5;
        vector[1] = 10;
        vector[2] = 7;

        System.out.println(  vector[0] );
        System.out.println("[ " + vector[1] + "]");
        System.out.println("[ " + vector[2] + "]");
*/

	//-------------------------------------------------------------------------------------
       
        //suma de vectores - Dinamico

	Scanner input = new Scanner(System.in);

        /*int [] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese los numeros a sumar");
            numeros[i] = input.nextInt();

            suma += numeros[i];
            //es lo mismo-> suma = suma + numeros[i]
        }

        System.out.println("La suma del array unidimensional (vector) es " + suma);
*/

       //-------------------------------------------------------------------------------------
		 
	//Matriz Dinamica- Mostrar la cantidad 0 que vamos a ingresar por teclado

        int [][] matriz = new int[4][4];
        int contador = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese los numeros para llenar la matriz");
                matriz[i][j] = input.nextInt();

            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == 0){
                    contador ++;
                }
            }
        }

        System.out.println("La cantidad de 0 que se ingreso en la matriz es : " + contador);

    }
}