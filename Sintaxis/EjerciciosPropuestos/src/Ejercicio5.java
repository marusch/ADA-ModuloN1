import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

     
        int m2precio = 3;
        int m2Apintar;
        int total;
	
	 //Ingresar datos por teclado desde la libreria Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuantos metros cuadrados son?");
        m2Apintar = input.nextInt();

        total = m2Apintar * m2precio;

        System.out.println("El precio total es " + total + " dolares");


    }
}
