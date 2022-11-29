package tema3;

public class EjemploArrays4 {
	
	/**
	 * Calcula si un número es o no primo
	 * @param numero
	 * @return
	 */
	public static boolean esPrimo(int numero) {
		boolean primo = true;
		for(int i=2; i<numero; i++) {
			if (numero % i == 0) {
				primo = false;
				break;
			}
		}
		
		return primo;
	}
	
	/**
	 * Pinta un vector de enteros de cualquier tamaño
	 * @param vector
	 */
	public static void pintarVectorInt(int vector[]) {
		System.out.print("[");
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i]);
			//Para no pintar la última ,
			if(i != vector.length-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		//1. Crea un array de 100 elementos, con valores aleatorios del 1 al 50		
		//2. Suma aquellos números que sean primos. Pinta, los que sean primos
		
		int numeros[] = new int[100000];
		
		//  Generar los números dentro del array
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 50) + 1;
		}
		
		pintarVectorInt(numeros);
		
		//Me recorro el array y veo aquellos que son primos
		int total = 0;
		for(int i=0; i < numeros.length; i++) {
			if (esPrimo(numeros[i])) {
				total += numeros[i];
				System.out.println("Este número es primo: " + numeros[i]);
			}
		}
		
		System.out.println("El total de los números primos es " + total);
		

	}

}
