package tema2;

public class EjemploWhile {

	public static void main(String[] args) {
		int n1=1, n2=2, suma=0;
		
		while(suma < 100) {
			suma += n1 + n2;  //suma = suma + (n1 + n2)
		}
		System.out.println(suma);
		
		//Números del 1 al 10
		int numero = 11;
		while (numero > 1) {
			numero--;
			System.out.println(numero);
			
		}
		//System.out.println(numero);
		
		//Del 1 al 10 con do-while
		numero = 0;
		do {
			numero++;
			System.out.println(numero);
		} while ( numero < 10);
		
		//Del 10 al 1 con do-while
		numero = 10;
		do {
			System.out.println(numero--);
		} while(numero > 0);
		
		//Del 1 al 100 con for
		for(numero=1; numero <= 100; numero++) {
			System.out.println(numero);
		}
		
		//Del 100 al 1 con for
		for(int i=100; i >= 1; i--) {
			System.out.println(i);
		}
		
		//Del 100 al 1 con for
		for(int i=0; i <= 100; i+=2) {
			System.out.println(i);
		}
		
	}

}
