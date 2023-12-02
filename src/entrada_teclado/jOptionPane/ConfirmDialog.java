package entrada_teclado.jOptionPane;

import javax.swing.*;

public class ConfirmDialog {
    public static void confirmDialog() {
        int option = JOptionPane.showConfirmDialog(null, "Elige una opción", "Opción", 1);
        if (option == 0) {
            System.out.println("Has elegido YES");
        } else if (option == 1) {
            System.out.println("Has elegido NO");
        } else if (option == 2) {
            System.out.println("Has elegido CANCEL");
        }
    }
}
