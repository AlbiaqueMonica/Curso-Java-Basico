package javaPrimerosPasos;

public class EjemploCicloFor {

	public static void main(String[] args) {
		
		int suma = 0;

		for (int contador = 1; contador <= 10; contador ++ ) {
			
			System.out.println(contador);
			
			suma += contador;
		}
		
		System.out.println("Suma = " +suma);

	}

}
