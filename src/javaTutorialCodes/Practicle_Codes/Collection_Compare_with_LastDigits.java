package javaTutorialCodes.Practicle_Codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_Compare_with_LastDigits {

	public static void main(String[] args) {
		
		
		Comparator<Integer> comp = new Comparator<Integer>() 
		{
			public int compare(Integer i, Integer j)
			{
				if(i%10 > j%10)
					return 1;
				else
					return -1;
			}
		};
		
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(46);
		nums.add(31);
		nums.add(45);
		nums.add(67);
		nums.add(54);
		
		
		Collections.sort(nums,comp);
		
		for(int n : nums)
		{
			System.out.println(n);
		}

	}

}
