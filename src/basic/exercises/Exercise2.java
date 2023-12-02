package basic.exercises;
/*Declarar dos variables numéricas (cualquier valor) e indicar
* cuál es el mayor de los dos valores, si son iguales, indicarlo también*/
public class Exercise2 {
    public static void exercise2() {
        int num1 = 6, num2 = 4;

        if (num1 == num2) {
            System.out.println("Los valores son iguales");
        } else if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        }else {
            System.out.println("El mayor es: " + num2);
        }
    }
}
