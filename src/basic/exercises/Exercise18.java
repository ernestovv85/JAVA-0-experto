package basic.exercises;

import java.util.Scanner;

/*Crea un programa para pedir números al usuario
* Cuando el usuario digite -1, el programa termina
* Al terminar, mostrará lo siguiente:
* -Número mayor
* -Número menor
* -Suma de números positivos
* -Suma de números negativos
* -Promedio de la suma
* **El -1 no debe contar como número** */
public class Exercise18 {
    public static void exercise18() {
        Scanner in = new Scanner(System.in);
        int num, max = 0, min = 0, sum = 0, sumPos = 0, sumNeg = 0, counter = 0;
        double average = 0;

        do {
            System.out.println("Introduce un número:");
            num = in.nextInt();
            if (min > num){
                min = num;
            }
            if(max < num) {
                max = num;
            }
            sum += num;
            if(num < 0) {
                sumNeg += num;
            }else if(num > 0) {
                sumPos += num;
            }
            counter++;
        }while (num != -1);

        average = (double) sum / counter;

        System.out.println(
                "El número mayor es: " + max + "\n" +
                "El número menor es: " + min + "\n" +
                "La suma de positivos es: " + sumPos + "\n" +
                "La suma de negativos es: " + sumNeg + "\n" +
                "El promedio de la suma es: " + average
        );
    }
}
