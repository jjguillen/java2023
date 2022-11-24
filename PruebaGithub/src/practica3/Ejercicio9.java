package practica3;

import java.util.Scanner;

public class Ejercicio9 {

	
	public static double factorial(double numero)  {
		double acumulador=1;
		
		for(int i = (int) numero; i>=1; i--) {
			acumulador = acumulador * i;
		}
		return acumulador;
	}
	
	
	public static void main(String[] args) {
		double numero=0;
		double acumulador=1;
		
		//Pedir número por teclado que quieres obtener el factorial
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número para calcular su factorial");
		numero = Double.parseDouble(sc.nextLine());
		
		//3 -> 3*2*1
		//4 -> 4*3*2*1
		//8 -> 8*7*6*5*4*3*2*1
		
		System.out.println("El factorial de " + numero + " es " + factorial(numero)) ;
	}

}
