package tema3;

import java.util.Arrays;

public class EjemploMatrizOrdenar {

	/**
	 * Pintar una matriz de cualquier tamaño de enteros
	 * @param matriz
	 */
	public static void pintarMatrizInt(int matriz[][]) {
		
		for(int i=0; i<matriz.length; i++) {
			System.out.print("[");
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				//Para no pintar la última ,
				if(j != matriz[i].length-1)
					System.out.print(", ");
			}
			System.out.println("]");
		}
	}
	
	public static void main(String[] args) {
		

		int matriz[][] = new int[5][5];
		
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		
		pintarMatrizInt(matriz);
		
		//Ordenar por filas
		for(int i=0; i < matriz.length; i++) {
			Arrays.sort(matriz[i]);
		}
		
		pintarMatrizInt(matriz);
				

	}

}
