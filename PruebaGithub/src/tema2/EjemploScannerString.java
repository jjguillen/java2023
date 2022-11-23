package tema2;

import java.util.Scanner;

public class EjemploScannerString {

	public static void main(String[] args) {
		
		String nombre = "", apellido1 = "", apellido2 = "";
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce tu nombre");
			nombre = sc.nextLine();
			System.out.println("Introduce tu primer apellido");
			apellido1 = sc.nextLine();
			System.out.println("Introduce tu segundo apellido");
			apellido2 = sc.nextLine();
		} catch (Exception e) {
			System.out.println("Error leyendo de teclado");
		}
		
		System.out.println("Te llamas: " + nombre + " " + apellido1 + " " + apellido2);
		
	}

}
