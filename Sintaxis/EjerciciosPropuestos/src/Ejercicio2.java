import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {       

 	double usd = 19.65;
        double mxn;
        double conver;

        //Ingresar datos por teclado desde la libreria Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuantos pesos mexicanos desea convertir?");
        mxn = input.nextDouble();

	//Conversion de pesos mexicanos a dolares
        conver = mxn / usd;

        System.out.printf("Adquieres %5.2f dolares",conver);


    }

}