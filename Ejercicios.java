package tema02;

public class Ejercicios {

	public static void main( String[] args ) {
		
		int camion1 = 3464;
		int camion2 = 664;
		int camion3 = 220;
		
		int resultadox = camion1 - camion2; 
		int resultado1 = camion1 / 8;
		int resultado2 = resultadox / 8;
		
		System.out.println("El resultado es: " + resultado1);
		System.out.println("El resultado es: " + resultado2);
		System.out.println("El resultado es: " + camion3);

		//1)
 		int a1 = 0;
 		int b1 = 2;
 		
 		System.out.println("A es menor o igual que 3 y b distinto 4  " + (a1<=3 && b1!=4));

		
 		//2)
 		int a2 = 6;
 		int b2 = 3;
 		double raiz = Math.sqrt(9);
 				
 		System.out.println("A es mayor que 5 y b es la raiz cuadrada de 9  " + (a2>5 || b2==raiz));

 	
 		//3)

 		System.out.println("A es mayor que 3 y A es menor que 5  " + (a2>3 && a2>3));

}
	
}
 		