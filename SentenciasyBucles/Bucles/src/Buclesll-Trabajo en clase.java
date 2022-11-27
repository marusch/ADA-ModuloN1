import java.util.Scanner;

public class Buclesll {

    public static void main(String[] args) throws InterruptedException {   

	//Reloj

        //variables
        int horas = 0, minutos = 0, segundos=0;

        //Condicionamos con true para que siempre ejecute y no corte el bucle.
        while (true){

            if (horas<10){
                System.out.print("0");
            }
            System.out.print(horas + ":");

            if (minutos<10){
                System.out.print("0");

            }
            System.out.print(minutos + ":");

            if (segundos<10){
                System.out.print("0");

            }
            System.out.println(segundos);

            segundos++;


            //Configuracion del tiempo en transcurso
            if (segundos==60) {
                segundos = 0;


                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;

                    if (horas==24){
                        horas=0;
                    }
                }
            }
            //Excepcion de espera (1 segundo - valor en milisegundos)
            Thread.sleep(1000);
	}
}