package basic.exercises;
/*Muestra los números de 1-100 ambosa incluídos.
* Usa un bucle while y un bucle for*/
public class Exercise10 {
    public static void exercise10While() {
        int serie = 0;
        while (serie < 100) {
            serie++;
            System.out.println(serie);
        }
    }

    public static void exercise10For() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
