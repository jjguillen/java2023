package prueba;

public class ConversionesImplicitas {

	public static void main(String[] args) {
		int medio=10; //4 bytes
		short corto=10; //2 bytes
		long largo=1000; //8 bytes
		char car = 'a';
		double decimal = 10.5e17d;
			
		System.out.println(corto);
		
		largo = corto; //conversión implícita -> Variable destino tiene más precisión que la variable a asignar

		medio = car; //conversión implícita -> Caracter a entero, por que se graban como números
		
		System.out.println(medio);
		
		car = (char) medio; //conversión explícita -> CAST
		
		System.out.println(car);
		
		largo = (long) decimal; //Se puede pero no es interesante, por que la representación interna es diferente. 
		
		System.out.println(largo);
		
		decimal = 45.946;
		largo = (long) decimal;  //Quitar la parte decimal de un número
		System.out.println(largo);
		
	}

}
