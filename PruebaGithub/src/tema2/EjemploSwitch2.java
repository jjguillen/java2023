package tema2;

public class EjemploSwitch2 {

	public static void main(String[] args) {
		//int diaSemana 1-7
		//Diga día de la semana que es (Lunes, Martes, ...)

		int diaSemana = 50;

		switch (diaSemana) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Día de la semana incorrecto");
				break;
		}

	}

}
