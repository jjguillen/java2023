package practica2;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		int a=10, b=3, e=1, d;
		boolean c=true;
		float x,y;
		
		x = (float) a / b;
		System.out.println(x);
		
		c = a < b && c;
		System.out.println(c);
		
		d= a + b++;
		System.out.println(d + " " + b );
		
		e = ++a - b;
		System.out.println(e + " " + a + " " + b);

	}

}
