import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02_Colecciones {

	public static void main(String[] args) {
		ArrayList<Float> alturas = new ArrayList<>();
		float alt = 1.0F;
		Scanner sc = new Scanner(System.in);
		
		while (alt!=0) {
			System.out.println("Introduce altura (metros), para salir introducir 0: ");
			alt = sc.nextFloat();
			if (alt!=0)
			alturas.add(alt);
		}
		System.out.println(alturas);
		sc.close();
		
		mediaYEncimaDebajo(alturas);
		maxima(alturas);
		minima(alturas);

	}
	
	public static void mediaYEncimaDebajo(ArrayList<Float> alturas) {
		float cont = 0.0F , media;
		for (int i=0; i<alturas.size(); i++) {
			cont+=alturas.get(i);
		}
		media = cont/alturas.size();
		System.out.println("MEDIA: " + media);
		
		int contmas = 0, contmenos = 0;
		for (int i=0; i<alturas.size(); i++) {
			if (alturas.get(i)>media)
				contmas++;
			else
				contmenos++;
		}
		System.out.println("POR ENCIMA DE LA MEDIA: " + contmas + "\n" + "POR DEBAJO DE LA MEDIA: " + contmenos);
	}
	
	public static void maxima(ArrayList<Float> alturas) {
		float max = 0.0F;
		for (int i=0; i<alturas.size(); i++) {
			if (alturas.get(i)>max)
				max=alturas.get(i);
		}
		System.out.println("EL MAS ALTO: " + max);
	}
	
	public static void minima(ArrayList<Float> alturas) {
		float min = 10.0F;
		for (int i=0; i<alturas.size(); i++) {
			if (alturas.get(i)<min)
				min=alturas.get(i);
		}
		System.out.println("EL MAS BAJO: " + min);
	}

}
