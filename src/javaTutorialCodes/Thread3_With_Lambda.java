package javaTutorialCodes;


//	class Del1 and Del2 now can be delete the entire parts because of anonymous created directly in object created 


//class Del1 implements Runnable
//{
//	public void run() 
//	{
//		for (int i = 0; i <= 5; i++) 
//		{
//			System.out.println("Hi");
//			try 
//			{
//				Thread.sleep(500);
//			} 
//			catch (InterruptedException e) 
//			{
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//class Del2 implements Runnable
//{
//	public void run() 
//	{
//		for (int i = 0; i <= 5; i++) 
//		{
//			System.out.println("Hello");
//			try 
//			{
//				Thread.sleep(500);
//			} 
//			catch (InterruptedException e) 
//			{
//				e.printStackTrace();
//			}
//		}
//	}
//}

public class Thread3_With_Lambda {

	public static void main(String[] args) {
		
//		Lambda Expression with anonymous class with Runnable

//		Runnable obj1 = new Runnable() 
//		{
//			public void run() 
//			{
//				for (int i = 0; i <= 5; i++) 
//				{
//					System.out.println("Hi");
//					try 
//					{
//						Thread.sleep(500);
//					} 
//					catch (InterruptedException e) 
//					{
//						e.printStackTrace();
//					}
//				}
//			}
//		};
//
//		Runnable obj2 = new Runnable() 
//		{
//			public void run() 
//			{
//				for (int i = 0; i <= 5; i++) 
//				{
//					System.out.println("Hello");
//					try 
//					{
//						Thread.sleep(500);
//					} 
//					catch (InterruptedException e) 
//					{
//						e.printStackTrace();
//					}
//				}
//			}
//		};
		
		
		
//		Further reducing the number of lines
		
		
		Runnable obj1 = () ->
			{
				for (int i = 0; i <= 5; i++) 
				{
					System.out.println("Hi");
					try	{Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
				}
			};

		Runnable obj2 = () ->
			{
				for (int i = 0; i <= 5; i++) 
				{
					System.out.println("Hello");
					try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
				}
			};
			
		

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

	}

}
