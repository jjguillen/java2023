package practica5;

public class EjerString3 {

	public static void main(String[] args) {
		
		String frase = "En un país de la Mancha de cuyo nombre no quiero acordarme, la de un un la la la la";
		String palabraBuscar = "un";
		
		int contador = 0;
		int posicion = 0;
		
		//Si devuelve -1 es que ya no lo encuentra
		while (posicion >= 0) {
			posicion = frase.indexOf(palabraBuscar, posicion);
			
			if (posicion >= 0) {
				contador++;
				//posicion++;  //Así también vale
				posicion += palabraBuscar.length(); //Para que busque a partir de la palabra encontrada
			} 			
		}
		
		System.out.println("La palabra " + palabraBuscar + " aparece " + contador + " veces.");
		
	}

}
