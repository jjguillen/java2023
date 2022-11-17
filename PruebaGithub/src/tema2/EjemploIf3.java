package tema2;

public class EjemploIf3 {

	public static void main(String[] args) {
	
		double nota1, nota2, nota3, notaExamen, notaFinal;
		double mediaPracticas;
		
		nota1 = 5;
		nota2 = 10;
		nota3 = 6;
		notaExamen = 3;
		
		mediaPracticas = (nota1 + nota2 + nota3) / 3;
		notaFinal = (mediaPracticas * 0.6) + (notaExamen * 0.4);
		
		if (mediaPracticas < 3) {
			System.out.println("Suspenso");
		} else if (notaExamen < 3) {
			System.out.println("Suspenso");
		} else if (notaFinal < 5) {
			System.out.println("Suspenso");
		} else if (notaFinal >= 5 && notaFinal < 8) {
			System.out.println("Notable");
		} else if (notaFinal >= 8) {
			System.out.println("Sobresaliente");
		}
		
		

	}

}
