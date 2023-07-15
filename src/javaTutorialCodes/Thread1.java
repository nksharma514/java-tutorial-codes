package javaTutorialCodes;

class Aac extends Thread {
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
class Xxz extends Aac{
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

public class Thread1 {

	public static void main(String[] args) {
		
		Aac obj1 = new Aac();
		Xxz obj2 = new Xxz();
		
		obj1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj2.start();
		

	}

}
