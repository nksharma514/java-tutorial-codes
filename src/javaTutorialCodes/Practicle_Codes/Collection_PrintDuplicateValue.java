package javaTutorialCodes.Practicle_Codes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Collection_PrintDuplicateValue {

	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<>();
		
		
		names.add("Naren");
		names.add("Mukesh");
		names.add("Kiran");
		names.add("Naren");
		names.add("Saroj");
		names.add("Naren");
		
		
		Set<String> s = new HashSet<>();		
		
		
		for(String name : names)
		{
			if(s.add(name) == false)
			System.out.println(name);
		}
		
		
		
		
		
		
	}

}
