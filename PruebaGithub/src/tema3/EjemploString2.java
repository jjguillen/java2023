package tema3;

public class EjemploString2 {

	public static void main(String[] args) {
		//Separa los números de una dirección ip 192.168.1.27, cuando los tengas súmalos
		
		String direccionIP = "192.168.1.72";
		
		// 192 -> direccionIP.substring(0,3)
		String op1 = direccionIP.substring(0,direccionIP.indexOf("."));
		String op2 = direccionIP.substring(direccionIP.indexOf(".") + 1,direccionIP.indexOf(".", direccionIP.indexOf(".") + 1));
		String op3 = direccionIP.substring(8,9);
		String op4 = direccionIP.substring(10,12);
		
		System.out.println(op1 + " " + op2 + " " + op3 + " " + op4);		
		
		int posicion = 0;
		String num = "";
		int suma = 0;
		while (direccionIP.indexOf(".", posicion) >= 0) {
			num = direccionIP.substring(posicion, direccionIP.indexOf(".", posicion));
			System.out.println(num);
			suma = suma + Integer.parseInt(num);
			posicion = direccionIP.indexOf(".", posicion) + 1;
		}
		num = direccionIP.substring(posicion); //Saca el último número hasta el final
		suma = suma + Integer.parseInt(num);
		System.out.println(num);
		
		System.out.println("La suma de los dígitos de la IP es " + suma);

	}

}
