package basic.exercises;

import javax.swing.*;

/*Crea una aplicación tipo calculadora
 * Se pedirán dos números y un signo aritmético
 * Al final se mostrará un cuadro de eiálogo con el resultado
 * Los signos aritméticos son:
 * +: suma
 * -: resta
 * *: mutiplicación
 * /: división
 * %: módulo*/
public class Exercise16 {
    public static void exercise16() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número:"));
        String symbol = JOptionPane.showInputDialog("Indica la operación \n+ suma\n - resta\n * multiplicación\n / división\n % residuo de división");
        int result = 0;
        switch (symbol) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("No se encontró la operación");
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + result);
    }
}
