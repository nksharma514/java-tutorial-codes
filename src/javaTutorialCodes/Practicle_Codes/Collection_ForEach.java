package javaTutorialCodes.Practicle_Codes;

import java.util.Arrays;
import java.util.List;

public class Collection_ForEach {

	public static void main(String[] args) {
		
//		List<Integer> nums = new ArrayList<>();
//		nums.add(5);
//		numa.add(8);
		
//		above code can be written as below both are same
		
		List<Integer> nums = Arrays.asList(5,8,4,2,6,3,9);
		
//		Rule-1 by normal for loop
		
//		for(int i = 0; i < nums.size(); i++)
//		{
//			System.out.println(nums.get(i));
//		}
		
//		Rule-2 by Adv for loop
		
//		for(int n : nums)
//		{
//			System.out.println(n);
//		}
		
//		Rule-3 by ForEach Method
		
//		nums.forEach(n -> System.out.println(n));
		
		
		
		
//		get even number the multiply by 2 and add all numbers
		
		int sum = 0;
		for(int n : nums)
		{
			if(n % 2 == 0)
			{
				n = n*2;
				sum = sum+n;
				
			}			
		}
		System.out.println(sum);
		

	}

}
