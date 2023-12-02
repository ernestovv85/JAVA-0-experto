package entrada_teclado.jOptionPane;

import javax.swing.*;

public class OptionDialog {
    public static void optionDialog() {
        int option = JOptionPane.showOptionDialog(
                null,
                "Elige una opción",
                "Opciones personalizadas",
                1,
                1,
                null,
                new Object[]{"Opción 1", "Opción 2", "Opción 3", "Opción 4"},
                "Opción 1"
        );
        if (option == 0) {
            System.out.println("Has elegido la opción 1");
        } else if (option == 1) {
            System.out.println("Has elegido la opción 2");
        } else if (option == 2) {
            System.out.println("Haz elegido la opción 3");
        } else if (option == 3) {
            System.out.println("Has elegido la opción 4");
        }
    }
}
