package practica2;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		double cantidad = 2000;
		double interes = 2.75 / 100;
		double retencion = 18.0 / 100;
		
		double misIntereses, misInteresesRetencion;
		
		misIntereses = 2000 * interes / 2;
		misInteresesRetencion = misIntereses * retencion;

		System.out.println(misIntereses + "€ sin retención");
		System.out.println("Hacienda se queda " + misInteresesRetencion);
		System.out.println("A mí me corresponde " + (misIntereses - misInteresesRetencion) + "€");
		
		double resultado = (2000*2.75/100/2) - ((2000*2.75/100/2)*0.18);
		System.out.println(resultado);
		
	}

}
