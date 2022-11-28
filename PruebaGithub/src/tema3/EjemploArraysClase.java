package tema3;

import java.util.Scanner;

public class EjemploArraysClase {

	public static void pintarVectorInt(int vector[]) {
		System.out.print("[");
		for(int i=0; i<vector.length; i++) {
			if(i == vector.length-1)
				System.out.print(vector[i] + "");
			else
				System.out.print(vector[i] + ", ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		//Crea un array de 6 elementos
		//Pide por teclado 6 enteros y guárdalos en las posiciones del array
		//Pinta el array
		//Dime el número mayor y en qué posición está. Variables mayor, posicion
		//Dime la suma de todos los números
		
		int elem[] = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		//Leer números de teclado
		try {
			for(int i=0; i < elem.length; i++) {
				elem[i] = Integer.parseInt(sc.nextLine());
			}
		} catch(Exception e) {
			System.out.println("Error leyendo de teclado");
		}
		
		//Sacar el mayor
		int mayor = elem[0];
		int posicion = 0;
		int suma = 0;
		
		for(int i=0; i<elem.length; i++) {
			if (elem[i] > mayor) {
				mayor = elem[i];
				posicion = i;
			}
			suma += elem[i];
		}
		
		pintarVectorInt(elem);
		
		System.out.println("El mayor es " + mayor + " esta en la posicion " + posicion);
		System.out.println("La suma es " + suma);

	}

}
