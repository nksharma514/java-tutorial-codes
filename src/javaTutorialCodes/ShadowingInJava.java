package javaTutorialCodes;

public class ShadowingInJava {
	
		int x = 5;
		
		class Inner{
			int x =7;
			
			void func(int x) {
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(ShadowingInJava.this.x);
			}
		}

	public static void main(String[] args) {
		
		ShadowingInJava out = new ShadowingInJava();
		ShadowingInJava.Inner in = out.new Inner();
		in.func(10);

	}
}

