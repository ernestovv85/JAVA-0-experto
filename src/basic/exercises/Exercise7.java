package basic.exercises;
/*Leer un número por teclado y mostrar por consola el caracter al que pertenece en la tabla ASCII.
* Ejemplo: si introduzco 51, se muestre la 'q'*/

import javax.swing.*;

public class Exercise7 {
    public static void exercise7() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        char character = (char) num;
        JOptionPane.showMessageDialog(null, "El caracter es: " + character);
    }
}
