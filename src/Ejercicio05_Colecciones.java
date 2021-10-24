import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05_Colecciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        ArrayList<Integer> array = new ArrayList<>();

        while (num!=-1) {
            System.out.println("Introduce un numero (-1 para salir)");
            num= sc.nextInt();
            if (num!=-1)
            array.add(num);
        }
        System.out.println("ARRAY: " + array);
    }
}
