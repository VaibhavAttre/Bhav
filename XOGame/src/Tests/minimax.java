package Tests;

public class minimax extends Thread {
	public static int amount = 0;
	public static void main (String[] args) {
		minimax obj = new minimax();
		Thread thread;
		thread.start();
		System.out.println(amount);
		amount++;
		System.out.println(amount);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("in run");
	}
	
	
}