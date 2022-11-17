package tema2;

public class EjemploIf {

	public static void main(String[] args) {
		
		//Variable precio = 295
		//Variable iva = 1.25
		//Variable cantidad = x
		
		//Calcular el total final aplicando el iva. Si la cantidad es mayor o igual que 5 no se le aplica iva
		
		double precio = 295;
		double iva = 1.25;
		int cantidad = 4;
		double total;
		
		if (cantidad >= 5) {
			total = precio * cantidad;
		} else {
			total = (precio * iva) * cantidad;
		}
		
		System.out.println("Total= "+total);
		

	}

}
