package tema2;

public class EjemploFor {

	public static void main(String[] args) {
		
		//1. Pinta todas las decenas del 1 al 10000
		for(int i=0; i<10000; i +=10) {
			System.out.println(i);
		}
		
		/*
		int i = 0;
		while(i<10000) {
			System.out.println(i);
			i = i + 10;
		}
		*/
		
		//2. Suma todos los números impares del 1 al 1000
		for(int i=1; i<=1000; i += 2) {
			System.out.println(i);
		}
		
		//3. Muestra los números entre -1 y 1, separados por 0.01
		for(double i=-1; i<1; i += 0.01) {
			System.out.println(i);
		}
		
		//4. Genera un número aleatorio entre el 1 y el 100. Muestra todos los números entre el 1 y el 100 menos ese aleatorio.		
		int numero =  (int) ((Math.random()*100) + 1);
		System.out.println(numero);
		
		for(int i=1; i<=100; i++) {
			if (i != numero) {
				System.out.println(i);
			}
		}
		
		//Mejor de la otra forma
		for(int i=1; i<=100; i++) {
			if (i == numero) {
				continue;
			}
			System.out.println(i);
		}


	}

}
