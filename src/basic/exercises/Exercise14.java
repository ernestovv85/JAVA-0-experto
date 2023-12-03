package basic.exercises;

import java.util.Scanner;

/*Crea una aplicación con un string que contenga una contraseña cualquiera
* Pide que se introduzca la contraseña con 3 intentos
* Al acertar ya no se pide la contraseña de nuevo y muestra el mensaje <<Enhorabuena>>*/
public class Exercise14 {

    public static void exercise14() {
        Scanner in = new Scanner(System.in);
        String password = "pass1234", confirmPassword;
        int tries = 0;
        System.out.println("Ingresa la contraseña");
        do {
            confirmPassword = in.nextLine();
            if (confirmPassword.equals(password)){
                System.out.println("Enhorabuena!");
                break;
            }else {
                tries++;
                if(tries < 3){
                    System.out.println("La contraseña es incorrecta. Ingresa la contraseña correcta:");
                }else {
                    System.out.println("Se excedió el número de intentos.");
                }
            }
        }while (tries < 3);
    }


}
