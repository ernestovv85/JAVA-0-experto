package basic.exercises;

import javax.swing.*;

/*Crear  un programa que calcule el sueldo de un trabajador.
* El programa solicita e número de horas trabajadas.
* El pago por hora es de 15 euros*/
public class Exercise8 {
    public static void exercise8() {
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas"));
        JOptionPane.showMessageDialog(null, "El pago correspodiente es: " + (horas * 15) + "Є");
    }
}
