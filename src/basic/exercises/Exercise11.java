package basic.exercises;
/*Muestra los números del 1-100 divisibles entre 2 y 3*/
public class Exercise11 {
    public static void exercise11() {
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0 || i % 3 ==0){
                System.out.println(i);
            }
        }
    }
}
