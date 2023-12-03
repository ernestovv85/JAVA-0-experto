package basic.exercises;

import javax.swing.*;


/*Realiza una aplicación que nos pida un número de ventas, después pedirá
* la cantidad de cada venta y arrojará la suma de todas las ventas*/
public class Exercise12 {
    public static void exercise12() {
        int sales = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de ventas"));
        float amount, sum = 0;
        for (int i = 0; i < sales; i++) {
            amount = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad " + (i +1)));
            sum += amount;
        }

        JOptionPane.showMessageDialog(null, "La suma de ventas es: " + sum);
    }
}