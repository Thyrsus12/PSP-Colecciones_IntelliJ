import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04_Colecciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Introduce valor inicial");
        int vi = sc.nextInt();

        System.out.println("Introduce incremento");
        int i = sc.nextInt();

        System.out.println("Introduce tamaño");
        int n = sc.nextInt();
        sc.close();

        for (int a=0; a<n; a++) {
            array.add(vi);
            vi+=i;
        }

        System.out.println(array);
    }
}
