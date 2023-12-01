package entrada_teclado.jOptionPane;

import javax.swing.*;
public class InputDialog {
    public static void inputDialog() {
//        String message = JOptionPane.showInputDialog(null, "Introduce un mensaje");
//        System.out.println(message);

        String number = JOptionPane.showInputDialog("Introduce un número");
        System.out.println(Integer.parseInt(number));
    }
}
