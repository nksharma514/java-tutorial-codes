package javaTutorialCodes.Practicle_Codes;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableMessage implements Callable<String>
{
	public String call() throws Exception
	{
		return "Hello World";
	}
}

public class MultiThreading_part1{
	
	static	ExecutorService executor = Executors.newFixedThreadPool(2);

	public static void main(String[] args) throws Exception {
		
//		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		CallableMessage task = new CallableMessage();
		Future<String> message = executor.submit(task);
		System.out.println(message.get().toString());

	}

}
