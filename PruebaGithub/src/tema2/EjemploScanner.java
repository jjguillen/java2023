package tema2;

import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		int numero=0, error;
		
		Scanner sc = new Scanner(System.in); //Leer de teclado
	
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Te has equivocado, introduce un entero por favor");
		}	
		
		System.out.println(numero);

	}

}
