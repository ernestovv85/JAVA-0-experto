package basic.exercises;

import java.util.Scanner;

/*Solicitar un número
Sumar pares e impares*/
public class Exercise20 {
    public static void exercise20() {
        Scanner in = new Scanner(System.in);
        int num, sumPair = 0, sumOdd = 0;
        System.out.println("Introduce un número:");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sumPair += i;
            }else {
                sumOdd += i;
            }
        }
        System.out.println(
                "La suma de pares es: " + sumPair + "\n" +
                "La suma de impares es :" + sumOdd
        );
    }
}
