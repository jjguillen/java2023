package tema2;

public class ejemploSwitch3 {

	public static void main(String[] args) {
		
		char operador = 's';
		
		double operando1, operando2, resultado;
		
		operando1 = 30;
		operando2 = 5;
		
		switch (operador) {
			case '+':
				resultado = operando1 + operando2;
				System.out.println(resultado);
				break;
			case '-':
				resultado = operando1 - operando2;
				System.out.println(resultado);
				break;
			case '*':
				resultado = operando1 * operando2;
				System.out.println(resultado);
				break;
			case '/':
				resultado = operando1 / operando2;
				System.out.println(resultado);
				break;
			case '%':
				resultado = operando1 % operando2;
				System.out.println(resultado);
				break;
			case 's':
				resultado = Math.sin(operando1);
				System.out.println(resultado);
				break;
			default:
				break;
		}
		

	}

}
