package javaPrimerosPasos;

public class EjemploCicloWhile {
	public static void main(String[] args) {

		int contador = 1;
		int suma = 0;
		while (contador <= 10) {
			System.out.println(contador);

			suma = suma + contador;
			

			contador += 1;
		}

		System.out.println("suma = " + suma);
	}

}
