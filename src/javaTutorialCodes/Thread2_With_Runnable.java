package javaTutorialCodes;

class Aa implements Runnable {
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Xx implements Runnable{
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread2_With_Runnable {

	public static void main(String[] args) {
		
		
		Runnable obj1 = new Aa();
		Runnable obj2 = new Xx();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		

	}

}
