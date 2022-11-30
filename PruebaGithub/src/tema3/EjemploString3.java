package tema3;

public class EjemploString3 {

	public static void main(String[] args) {
		//Comprueba que una cadena tenga mayúsculas
		//Pista: usa el método toLowerCase
		//Si al convertir la cadena a mínusculas es igual que la original -> no tenía mayúsculas
		//hola -> hola ,  Hola -> hola
		
		String cadena = "asdflja0258038503A";
		
		if (cadena.equals(cadena.toLowerCase())) {
			System.out.println("Cadena en minúsculas");
		} else {
			System.out.println("La cadena tiene al menos una mayúscula");
		}
		
		

	}

}
