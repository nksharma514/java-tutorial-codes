package javaTutorialCodes.Practicle_Codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_Compare_Length_of_String {

	public static void main(String[] args) {
		
		
		Comparator<String> comp = new Comparator<String>() 
		{
			
			public int compare(String s1, String s2)
			{
				if(s1.length() > s2.length())
					return 1;
				else
					return -1;
			}
			
		};
		
		
		List<String> name = new ArrayList<>();
		
		name.add("Narendra");
		name.add("Raju");
		name.add("Neelam");
		name.add("Manoj");
		
		
		Collections.sort(name,comp);
		
		
		for(String s : name) 
		{			
			System.out.println(s + " : " + s.length());
		}
		
	}

}
