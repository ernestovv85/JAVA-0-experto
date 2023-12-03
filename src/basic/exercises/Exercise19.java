package basic.exercises;

import java.util.Scanner;

/*Calcula el factorial del número ingresado por el usuario*/
public class Exercise19 {
    public static void exercise19() {
        Scanner in = new Scanner(System.in);
        int factorial = 1, num;
        System.out.println("Ingresa un número:");
        num = in.nextInt();
        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
