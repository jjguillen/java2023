package prueba;

public class OperadoresUnitarios {
	
	public static void main(String[] args) {
		int a=0, b=0;
		int res=0;
		
		a++; //a = a + 1
		
		for(a=0; a<10; a++) {
			System.out.println("La a vale: " + a);
			System.out.println(a++); //Pintaría a sin sumarle 1
			//System.out.println(++a); //Pintaría a habiéndole primero sumado 1
			
		}
		
		a = 3 + (a++ * 2);
		a=3;
		b=5;
		res=a%b*3/5;
		
		System.out.println(res);

	}

}
