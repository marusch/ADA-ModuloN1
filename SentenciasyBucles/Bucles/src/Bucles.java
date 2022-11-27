import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        // 1- Muestra los números del 1 al 50 (ambos incluidos)
        // divisibles entre 2. Utiliza el bucle que desees.

       /* Opcion a :

       while(num<=50){

            if(num%2==0){
                System.out.println("Los numeros divisibles por 2 son: " + num);
            }
            num++;
        }

        Opcion b :

        for (int num=1; num<=50; num++){
            if(num%2==0){
                System.out.println(num);
            }

          }*/

        //------------------------------------------------------------------------------//

        //2- Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
        // si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

         Scanner input = new Scanner(System.in);
         int codigo = 0;
       /*
            do {
                System.out.println("Ingrese un numero mayor a 0");
                codigo = input.nextInt();
            }while (codigo<=0);

        System.out.println(codigo);

        */

        //------------------------------------------------------------------------------//

        //3-Reemplaza todas las o del String anterior por una i.

         //String cadena = "Hola Mundo ";
        //System.out.println(cadena.replace('o','i');

        //Cuenta cuantos caracteres contiene la cadena de textos.
        //System.out.println("La cadena tiene " + cadena.length() + " caracteres");

        //------------------------------------------------------------------------------//

        //4- Lee un número por teclado y comprueba que este numero es mayor o igual que 5,
        // si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
        /*
        int num = 0;

        do{
            System.out.println("Ingrese un numero mayor a 5");
            num = input.nextInt();
        } while (num<=5);

        System.out.println("Fin del bucle, el numero " + num + "es mayor a 5");
        */

  
     

        }

    }
}