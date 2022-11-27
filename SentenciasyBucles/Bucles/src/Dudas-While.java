import java.util.Scanner;

public class Dudas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int intentos = 0;
        int pass= 123;

        while(intentos<3){
            System.out.println("Escriba su contraseña");
            int contraseña = input.nextInt();

           if (pass!=contraseña){
               System.out.println("Error");

           } else {
               System.out.println("Exito!");
           }

            intentos++;
        }



    }
}