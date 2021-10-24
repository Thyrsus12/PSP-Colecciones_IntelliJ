package Ejercicio01;

import java.util.ArrayList;

public class Ejercicio01_Libreria_Colecciones {

		public static ArrayList<Integer> generaArrayListInt(int min, int max, int tam) {
			ArrayList<Integer> lista = new ArrayList<>();
			for (int i=0; i<tam; i++) {
				lista.add((int)(Math.random()*(max-min+1)+min));
				
			}
			return lista;
		}
		
		public static int minimoArrayListInt(ArrayList<Integer> lista, int max) {
			int min = max;
			for (int i=0; i<lista.size(); i++) {
				if (lista.get(i)<min)
					min=lista.get(i);
			}
			return min;
		}
		
		public static int maximoArrayListInt(ArrayList<Integer> lista) {
			int max = 0;
			for (int i=0; i<lista.size(); i++) {
				if (lista.get(i)>max)
					max=lista.get(i);
			}
			return max;
		}
		
		public static int mediaArrayListInt(ArrayList<Integer> lista, int tam) {
			int cont = 0;
			for (int i=0; i<lista.size(); i++) {
				cont+=lista.get(i);
			}
			cont/=tam;
			return cont;
		}
		
		public static void estaEnArrayListInt(ArrayList<Integer> lista, int num) {
			if(lista.contains(num))
				System.out.println("NUMERO ENCONTRADO");
			else
				System.out.println("NUMERO NO ENCONTRADO");
		}
		
		public static void posicionEnArrayListInt(ArrayList<Integer> lista, int num) {
			if(lista.contains(num)) {
				System.out.println("SE ENCUENTA EN LA POSICION: " + lista.indexOf(num));
			}
		}
		
		public static ArrayList<Integer> volteaArrayListInt(ArrayList<Integer> lista) {
			//Collections.reverse(lista);
			ArrayList<Integer> aux = new ArrayList<>();
			for (int i=lista.size()-1; i>-1; i--) {
				aux.add(lista.get(i));
			}
			return aux;
		}
}//TIRSO GARCIA