package basic.exercises;

import java.util.Scanner;

/*Leer un número por teclado e indicar si es divisible entre 2,
* caso contrario, también indicarlo.*/
public class Exercise5 {
    public static void exercise5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digita un número:");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es divisible entre 2");
        }else {
            System.out.println("El número " + num + " no es divisible entre 2");
        }
    }
}
