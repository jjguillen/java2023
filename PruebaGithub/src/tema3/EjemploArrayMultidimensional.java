package tema3;

public class EjemploArrayMultidimensional {

	public static void main(String[] args) {
		
		double notas[][] = new double[10][5];  //10 alumnos, 5 notas de cada alumno
		// alumno1 - notaP notaBD notaE notaLM notaS
		//             5      7     6      8     9
		// 			   3      7     1      2     9
		// ...
		// 			   10     7     5      8     3
		
		double notas2[][] = { {5,7,6,8,9}, {3,7,1,2,9}, {3,7,1,2,9}, {3,7,1,2,9}, {3,7,1,2,9}
							, {3,7,1,2,9}, {3,7,1,2,9}, {3,7,1,2,9}, {3,7,1,2,9}, {3,7,1,2,9} };
		
		
		for(int i=0; i < notas2.length; i++) {
			for(int j=0; j < notas2[0].length; j++) {
				System.out.print(notas2[i][j]+" ");
			}
			System.out.println();
		}

	}

}
