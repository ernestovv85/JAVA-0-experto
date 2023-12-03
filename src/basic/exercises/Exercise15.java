package basic.exercises;

import java.util.Scanner;

/*Crea una aplicación que pida un día de la semana y diga si es laboral o no.
 * Utilizar un switch*/
public class Exercise15 {
    public static void exercise15() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa un día de la semana");
        String day = in.nextLine().toLowerCase();

        switch (day) {
            case "lunes", "martes", "miercoles", "jueves", "viernes":
                System.out.println("El " + day + " es día laboral");
                break;
            case "sabado", "domingo":
                System.out.println("El " + day + " no es día laboral");
                break;
            default:
                System.out.println("No se encontró el dato indicado");
        }
    }
}
