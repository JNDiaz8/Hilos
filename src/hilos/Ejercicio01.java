package hilos;

public class Ejercicio01 {
	
	public static void main(String[] args) {
//		Thread hilo1 = new HilosNumeros();
//		Thread hilo2 = new HilosNumeros();
//		hilo1.start();hilo2.start();
		for (int i = 0; i < 1000; i++) 
			new HilosNumeros().start();
		System.out.println("Fin del hilo " 
		+ Thread.currentThread().getName());

	}

}
class HilosNumeros extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 2_000_000_000; i++) {
			System.out.println(i + "--"
					+ Thread.currentThread().getName());
		}
	}
}

