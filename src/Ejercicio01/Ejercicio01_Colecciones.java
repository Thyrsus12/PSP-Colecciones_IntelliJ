package Ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01_Colecciones {

	public static void main(String[] args) {
		ArrayList<Integer> lista;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el minimo:");
		int min = sc.nextInt();
		System.out.println("Introduce el maximo:");
		int max = sc.nextInt();
		System.out.println("Introduce el tamaño:");
		int tam = sc.nextInt();
		
		lista= Ejercicio01_Libreria_Colecciones.generaArrayListInt(min,max,tam);
		System.out.println(lista);
		
		System.out.println("MINIMO: " + Ejercicio01_Libreria_Colecciones.minimoArrayListInt(lista, max));
		
		System.out.println("MAXIMO: " + Ejercicio01_Libreria_Colecciones.maximoArrayListInt(lista));
		
		System.out.println("MEDIA: " + Ejercicio01_Libreria_Colecciones.mediaArrayListInt(lista, tam));
		
		System.out.println("Introduce numero que buscas:");
		int num = sc.nextInt();
		sc.close();
		Ejercicio01_Libreria_Colecciones.estaEnArrayListInt(lista, num);
		
		Ejercicio01_Libreria_Colecciones.posicionEnArrayListInt(lista, num);
		
		System.out.println(Ejercicio01_Libreria_Colecciones.volteaArrayListInt(lista));
	}
}