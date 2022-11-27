import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

	int precioHora = 4;
        int horasUsadas;
        int cobro;

        //Ingresar datos por teclado desde la libreria Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuantas horas hizo uso del estacionamiento?");
        horasUsadas = input.nextInt();

	//Calculo de cuanto van a cobrar
        cobro = horasUsadas * precioHora;

        System.out.println("El cobro es de " + cobro + " dolares");

    }

}