import java.util.ArrayList;

public class Ejercicio06_Colecciones {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int cont = 0;

        for (int i=1; i<=10; i++){
            cont++;
            for (int a=0; a<cont; a++) {
                array.add(i);
            }
        }
        System.out.println("ARRAY: " + array);
    }
}
