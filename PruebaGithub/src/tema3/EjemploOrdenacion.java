package tema3;

import java.util.Arrays;

public class EjemploOrdenacion {
	/**
	 * Ordenar un vector de enteros usando el algoritmo de la burbuja (bubblesort)
	 * @param numeros
	 */
	public static void burbuja(int numeros[]) {
		
		int aux;
		
		for (int i=numeros.length; i > 0; i--) {
			for (int j=0; j < i-1; j++) {
				if (numeros[j] > numeros[j+1]) {
					//Intercambiar
					aux = numeros[j+1];
					numeros[j+1] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// IMPORTANTE: los arrays se pasan por referencia en Java automáticamente
		long tiempo = 0;
		
		//Declaración del array		
		int nums[] = new int[200];
		
		//Rellenar con números aleatorios		
		for(int i=0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100000) + 1;
		}
		
		
		//Rellenar un vector con un mismo valor
		//Arrays.fill(nums, 10);
		
		//Pintar array
		/*
		for(int i=0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		*/
		
		//Ordenar
		//burbuja(nums);
		
		//Ordenar con Java
		tiempo = System.currentTimeMillis();
		Arrays.sort(nums);
		tiempo = System.currentTimeMillis() - tiempo;
		
		System.out.println();
		System.out.println("Ha tardado: " + tiempo + " milisegundos");
		
		//Pintar array
		for(int i=0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
		
		
		
		
		
		
	}

}
