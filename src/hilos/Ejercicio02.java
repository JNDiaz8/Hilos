package hilos;

public class Ejercicio02 {

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) 
			new Thread((new HilosNumerosAleatorios(
					100_000 + (int)Math.random() 
					* 2_000_000_000))).start();
		
		System.out.println("Fin del hilo " 
			+ Thread.currentThread().getName());
		}
}

class HilosNumerosAleatorios implements Runnable {
	private int numero;
	
	public HilosNumerosAleatorios(int numero) { 
		this.numero = numero;
		}

	@Override
	public void run() {
		for (long i = 0; i < numero; i++) {
			System.out.println(i + "--"
					+ Thread.currentThread().getName());
		}
	}
	
}
