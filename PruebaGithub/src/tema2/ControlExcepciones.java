package tema2;

public class ControlExcepciones {

	public static int dividir(int num1, int num2) throws Exception {
		if (num2 == 0) {
			throw new Exception("División por zero by JJ");
		} 
		
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		
		int numero = 5;
		
		//Excepción
		//Lo que hay en el bloque try {} se intenta ejecutar
		//Si hay un error se interrumpe el bloque y pasa a ejecutarse lo que hay en el catch
		try {
			
			System.out.println("Voy a intentar hacer una división por cero");
			numero = numero / 0;
			System.out.println("Si llegas aquí es que has podido dividir por cero");
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e2)	{
			System.out.println("Ha pasado otra cosa "+ e2.getMessage());
		} 
		
		//Convertir un string a entero
		String cadena = "23a";
		int num=0;
		
		try {
			num = Integer.parseInt(cadena); //23a -> entero  ERROR
			System.out.println("Otra");
		} catch(NumberFormatException e) {
			System.out.println("No se puede convertir la cadena a entero, no es un entero es otra cosa");
		} catch(ArithmeticException e) {
			System.out.println("Error aritmético");
		} catch(Exception e) {
			System.out.println("Ha pasado algo, pero no sé qué");
		}
		
		System.out.println(num);
		
		try {
			System.out.println(dividir(3,0));
		} catch(Exception e) {
			System.out.println("Qué bueno soy programando, esto no falla "+e.getMessage());
		}

	}

}
