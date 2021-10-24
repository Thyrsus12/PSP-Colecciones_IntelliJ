import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03_Colecciones {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String cad = "a";
		
		while (cad.equalsIgnoreCase("a") || cad.equalsIgnoreCase("b") || cad.equalsIgnoreCase("c")) {
			System.out.println("""
					MENU:\s
					a) Mostrar valores
					b) Introducir valor al final
					c) Introducir valor en una posicion
					d) Salir
					""");
		cad = sc.next();
		
		if (cad.equalsIgnoreCase("a"))
			mostrar(lista);
		if (cad.equalsIgnoreCase("b"))
			introducirFinal(lista, sc);
		if (cad.equalsIgnoreCase("c"))
			introducirPosicion(lista, sc);
		if (cad.equalsIgnoreCase("d"))
			System.out.println("PROGRAMA FINALIZADO");
		else 
			System.out.println("ERROR, VUELVE A INICIAR EL PROGRAMA");
		}
		sc.close();
	}
	
	public static void mostrar(ArrayList<Integer> lista) {
		System.out.println(lista + "\n");
	}
	
	public static void introducirFinal(ArrayList<Integer> lista, Scanner sc) {
		System.out.println("Introduce valor: ");
		lista.add(sc.nextInt());
	}
	
	public static void introducirPosicion(ArrayList<Integer> lista, Scanner sc) {
		System.out.println("Introduce valor: ");
		int v = sc.nextInt();
		System.out.println("Introduce posicion: ");
		int pos = sc.nextInt();
		lista.add(pos, v);
	}

}