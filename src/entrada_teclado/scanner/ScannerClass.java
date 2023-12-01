package entrada_teclado.scanner;

import java.util.Scanner;
public class ScannerClass {
    static Scanner in = new Scanner(System.in);
    public static void scanner () {
//        System.out.println("Digita un color");
//        String color = in.nextLine();
//        System.out.println("Tu color es " + color);
        System.out.println("Digita un número");
        int number = in.nextInt();
        System.out.println("El número es: " + number);

    }
}
