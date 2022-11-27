import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int yearOfBirth;
        int age;

	
        //Ingresar datos por teclado desde la libreria Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese año de nacimiento");
        yearOfBirth = input.nextInt();

	//Calcular la edad actual
        age = 2022 - yearOfBirth;

        System.out.println("La persona tiene " + age + " años");



    }

}