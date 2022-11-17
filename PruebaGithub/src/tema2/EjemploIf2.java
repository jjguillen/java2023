package tema2;

public class EjemploIf2 {

	public static void main(String[] args) {
		//Variable edad = 2  (int)
		//Variable sexo = 'H', 'M' (char)
		
		//Indicar si eres niño/a [0-11]
		// si eres adolescente [12-18]
		// si eres joven [19-29]
		// si eres hombre/mujer [30-55]
		// si eres viejo/vieja [56- infinito)
		// en otro caso -> datos incorrectos
		
		int edad = -1;
		char sexo = 'M';
		
		
		//Niño/a
		if ( (edad >= 0) && (edad <= 11) ) {
			if (sexo == 'H') {
				System.out.println("Niño");
			} else if (sexo == 'M') {
				System.out.println("Niña");
			}			
		} else if ( (edad >= 12) && (edad <= 18) ) { //Adolescente
			System.out.println("Adolescente");
		} else if ( (edad >= 19) && (edad <= 29) ) { //Joven
			System.out.println("Joven");
		} else if ( (edad >= 30) && (edad <= 55) ) {
			if (sexo == 'H') { //Hombre/Mujer
				System.out.println("Hombre");
			} else if (sexo == 'M') {
				System.out.println("Mujer");
			}
		} else if ( edad >= 56 && sexo == 'H' ) {
			System.out.println("Viejo");
		} else if ( edad >= 56 && sexo == 'M' ) {
			System.out.println("Vieja");
		} else {
			System.out.println("Datos incorrectos");
		}
		

	}

}
