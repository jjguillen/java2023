package tema3;

public class EjemploStringBuffer {

	public static void main(String[] args) {
		//Si vamos a concatenar mucho una cadena, es mejor usar StringBuffer, y añadir con append
		StringBuffer strb = new StringBuffer();
		for(int i=0; i < 20; i++) {
			strb.append(String.valueOf(i));
			strb.append(" ");
		}		
		String resultado = strb.toString(); //Convertir StringBuffer en String
		System.out.println(resultado);

		
		//Lo mismo pero con String. Funciona pero no es eficiente desde el punto de vista de la memoria y JVM
		String cadena = "";
		for(int i=0; i < 20; i++) {
			cadena = cadena + String.valueOf(i);
			cadena = cadena + " ";
		}		
		System.out.println(cadena);
	}

}
