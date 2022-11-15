package prueba;

public class Comparadores {

	public static void main(String[] args) {
		int a=4, b=4;
		int x=2, y=5;
		boolean res;		
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a <= b);
		
		if (a != b) {
			System.out.println("No son iguales a y b");
		} else {
			System.out.println("Sí son iguales a y b");
		}
		
	
		res=  ( x>y && x>=y ); //false   ​
		System.out.println(res);
		res=  ( x<y && x<=y ); //verdadero     ​
		System.out.println(res);
		res= !( x<y || x!=y ); //falso
		System.out.println(res);
	}

}
