package tema2;

import java.io.IOException;
import java.util.Scanner;

public class EjemploMenu {

	
	public static void main(String[] args) throws Exception {
				
		int opcion = 0;
		
		//CREAR SCANNER
		Scanner sc = new Scanner(System.in);
		
		//BUCLE PARA REPETIRLO HASTA QUE LA OPCIÓN SEA 4
		do {
			
			//PINTAN LAS OPCIONES
			System.out.println("1. Saludar");
			System.out.println("2. Despedirte");
			System.out.println("3. Darse la mano");
			System.out.println("4. Salir");
			
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
					System.out.println("Hola qué tal!");				
					break;
	
				case 2:
					System.out.println("Hasta pronto!");				
					break;
					
				case 3:
					System.out.println("Encantado!");				
					break;
	
				case 4:
					System.out.println("Adiós! Fin de programa!");				
					break;
				default:
					System.out.println("Número de opción incorrecto");
			}
			
		} while (opcion != 4);
		

	}

}
