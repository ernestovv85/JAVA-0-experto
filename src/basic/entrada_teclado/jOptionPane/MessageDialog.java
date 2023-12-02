package basic.entrada_teclado.jOptionPane;

import javax.swing.*;
public class MessageDialog {
    public static void messageDialog() {
//        String text = JOptionPane.showInputDialog("Introduce un texto");
//        JOptionPane.showMessageDialog(null, text);

        int number = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        JOptionPane.showMessageDialog(null, "El número digitado es: " + number);
    }
}
