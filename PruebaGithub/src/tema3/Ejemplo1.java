package tema3;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		int numeros[] = new int[10]; //array de int
		int numeros2[];
		float precios[] = { 10.0f, 11f, 9.99f, 8.85f };
		
		//Pintar
		for(int i=0; i <= precios.length-1; i++) {
			System.out.println(precios[i]);
		}
		
		System.out.println(precios[2]);
		
		
		numeros2 = numeros.clone(); //Copiar un array en otro
		numeros2[3] = 1000;
		
		//Pintar
		for(int i=0; i <= numeros2.length-1; i++) {
			System.out.println(numeros2[i]);
		}
		
		
		
	}

}
