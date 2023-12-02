package basic.exercises;

import javax.swing.*;

/*Lee un número por teclado, que pida el precio de un producto (puede tener decimales)
* Calcule el precio final con iva(21%) */
public class Exercise9 {
    public static void exercise9() {
        float price = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del producto"));
        JOptionPane.showMessageDialog(null, "El precio total es: " + (price * 1.21) + "Є");
    }
}
