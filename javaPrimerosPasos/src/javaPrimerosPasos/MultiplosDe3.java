package javaPrimerosPasos;

public class MultiplosDe3 {

	public static void main(String[] args) {

		for (int num = 0; num <= 100; num++) {

			if (num % 3 == 0) {
				System.out.println(num);
			}
		}
		
		for (int num = 0; num <= 100; num+=3) {

			if (num % 3 == 0) {
				System.out.println(num);
			}
		}

	}

}
