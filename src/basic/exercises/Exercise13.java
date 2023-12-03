package basic.exercises;

import java.util.Scanner;

/*Solicita un número y comprueba que sea mayor o igual a 0
* Caso contrario, vuelvelo a pedir
* Usar bucle do while*/
public class Exercise13 {
    public static void exercise13() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num;
        do{
            num = in.nextInt();
            if (num >= 0) {
                System.out.println("El número ingresado es mayor o igual a 0");
            }else {
                System.out.println("Ingresa de nuevo el número");
            }
        } while(num < 0);
    }
}
