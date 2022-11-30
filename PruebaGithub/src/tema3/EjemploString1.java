package tema3;

public class EjemploString1 {

	public static void main(String[] args) {
		//1. Contar vocales de una cadena
		String vocales = "aeiouáéíóúAEIOU";
		String cadena = "Esto de la programación es más difícil de lo que parece";
		int contador=0;
		//Recorrerse la cadena caracter a caracter ->  .charAt(i)
		for(int i=0; i < cadena.length(); i++) {
			//System.out.println(cadena.charAt(i));
			
			//Vocales, vocales con acento, mayúsculas
			
			//CON IF
			/*
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' ||
					cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u' || cadena.charAt(i) == 'á' || 
					cadena.charAt(i) == 'é' || cadena.charAt(i) == 'í' ||
					cadena.charAt(i) == 'ó' || cadena.charAt(i) == 'ú' || cadena.charAt(i) == 'A' || 
					cadena.charAt(i) == 'E' || cadena.charAt(i) == 'I' ||
					cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U') {
				contador++;
			}	
			*/
			
			//CON SWITCH
			/*
			switch (cadena.charAt(i)) {
			case 'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú', 'A', 'E', 'I', 'O', 'U':
				contador++;
				break;
			}*/
			
			//CON INDEXOF -> buscar cada caracter de la cadena en la cadena que contiene las vocales
			//Si lo encuentra (>=0) le añade uno al contador de vocales
			if (vocales.indexOf( cadena.charAt(i) ) >= 0)
				contador++;
			
			
			
		}
		
		System.out.println("Número de vocales: " + contador);
		
 		

	}

}
