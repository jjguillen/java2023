package practica2;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		System.out.println(Math.random());
		
		int n = (int) (Math.random() * 49) + 1;
		System.out.println(n);
		
		n = (int) (Math.random() * (101)) - 150;
		System.out.println(n);
		
		//Meses
		int mes = (int) (Math.random() * 12) + 1;
		//System.out.println(mes);
		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			break;
		}
		
	}
}
