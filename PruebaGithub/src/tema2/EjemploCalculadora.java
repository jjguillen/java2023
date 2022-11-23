package tema2;

import java.util.Scanner;

public class EjemploCalculadora {

	/**
	 * Función que lee un double de teclado
	 * @param sc
	 * @return
	 */
	public static double leerTeclado() {
		double numero=0;
		
		//CREAR SCANNER
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número");
		try {
			numero = Double.parseDouble(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return numero;		
	}
	
	
	public static void main(String[] args) {
		int opcion = 0;
		double numero1 = 0, numero2 = 0;
		double resultado = 0;
		
		
		//BUCLE PARA REPETIRLO HASTA QUE LA OPCIÓN SEA 4
		do {
			
			//CREAR SCANNER
			Scanner sc = new Scanner(System.in);
			
			//PINTAN LAS OPCIONES
			System.out.println("0. Salir");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			
			//PIDE QUE EL USUARIO ELIJA SU OPCION
			System.out.print("Dime la opción que eliges: ");
			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				//System.out.println("Opción incorrecta (1,2,3,4)");
				opcion = 0;
			}
			
			//HARÍA ACCIONES EN FUNCIÓN DE LA OPCIÓN ELEGIDA
			switch (opcion) {
				case 1:
					numero1 = leerTeclado();
					numero2 = leerTeclado();
					resultado = numero1 + numero2;
					System.out.println("Resultado= " + resultado);
					break;
	
				case 2:
					numero1 = leerTeclado();
					numero2 = leerTeclado();
					resultado = numero1 - numero2;
					System.out.println("Resultado= " + resultado);
					break;
					
				case 3:
					numero1 = leerTeclado();
					numero2 = leerTeclado();
					resultado = numero1 * numero2;	
					System.out.println("Resultado= " + resultado);
					break;
	
				case 4:
					numero1 = leerTeclado();
					numero2 = leerTeclado();
					resultado = numero1 / numero2;	
					System.out.println("Resultado= " + resultado);
					break;
					
				case 0:
					System.out.println("Adiós! Fin de programa!");				
					break;
				default:
					System.out.println("Número de opción incorrecto");
			}
			
		} while (opcion != 0);
	}

}
