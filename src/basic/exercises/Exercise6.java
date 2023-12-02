package basic.exercises;

import java.util.Scanner;

/*Realizar la suma de un número, hasta el número de veces que se indique.
* Comprobar que el número sea mayor a 1*/
public class Exercise6 {
    public static void exercise6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digita un número");
        int num = in.nextInt();
        int result = 0;
        if (num > 1) {
            System.out.println("Indica el número de veces que se debe sumar");
            int limit = in.nextInt();
            for (int i = 1; i <= limit; i++) {
                result = i + num;
                System.out.println(result);
            }
        }else {
            System.out.println("El número debe ser mayor a 1");
        }
    }
}
