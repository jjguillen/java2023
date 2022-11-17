package tema2;

public class EjemploSwitch1 {

	public static void main(String[] args) {
		//[0-5) suspenso
		//[5-7) bien
		//[7-9) notable
		//[9-10] sobresaliente
		
		double nota = 12;
		
		//VERSION CON IF
		if (nota >= 0 && nota < 5) {
			System.out.println("Suspenso");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable");			
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Error");
		}
		
		//VERSIÓN 2 CON IF
		if (nota < 0 || nota > 10) {
			System.out.println("Error");
		} else if (nota < 5) {
			System.out.println("Suspenso");
		} else if (nota < 7) {
			System.out.println("Bien");			
		} else if (nota < 9) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}
		
		
		//VERSION CON SWITCH
		//Nota: 0,1,2,3,4,5,6,7,8,9,10
		int notaEntero = 7;
		
		switch (notaEntero) {
		case 0: {
			
		}
		case 1: {
			
		}
		case 2: {
			
		}
		case 3: {
			
		} 
		case 4: {
			System.out.println("Suspenso");
			break;
		}
		case 5: {
			
		}
		case 6: {
			System.out.println("Aprobado");
			break;
		}
		case 7: {
			
		}
		case 8: {
			System.out.println("Notable");
			break;
		}
		case 9: {
			
		}
		case 10: {
			System.out.println("Sobresaliente");
			break;
		}
		default:
			throw new IllegalArgumentException("Valor inesperado: " + notaEntero);
		}
		
		
		
	}

}
