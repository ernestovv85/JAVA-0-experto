package basic.exercises;

import javax.swing.*;

/*Crea una aplicación que pida el nombre (usar JOptionPane) y que lo muestre en otra ventana*/
public class Exercise4 {
    public static void exercise4() {
        String name = JOptionPane.showInputDialog("Introduce tu nombre:");
        JOptionPane.showMessageDialog(null, "Tu nombre es: " + name);
    }
}
