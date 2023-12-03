package basic.exercises;

import javax.swing.*;

/*crea una aplicación que permita insertar números hasta que se ingrese -1
 * calcular el número de insersiones*/
public class Exercise17 {
    public static void exercise17() {
        int num, counter = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            counter++;
            if (num == -1) {
                JOptionPane.showMessageDialog(null, "La cantidad de números ingresados es : " + counter);
            }
        } while (num >= 0);
    }
}
