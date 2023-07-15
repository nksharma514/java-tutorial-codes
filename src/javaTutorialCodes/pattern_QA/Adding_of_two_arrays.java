package javaTutorialCodes.pattern_QA;

import java.util.Arrays;

public class Adding_of_two_arrays {		
	
	public static void main(String[] args) {
		
		int FirstArray[] = {1,5,6,4,3};
		int SecondArray[] = {8,9,7};
		
		int fal = FirstArray.length;
		int sal = SecondArray.length;
		
		
		int result[] = new int[fal + sal];
		
		System.arraycopy(FirstArray, 0, result, 0, fal);
		System.arraycopy(SecondArray, 0, result, fal, sal);
		
		System.out.println(Arrays.toString(result));
		
		
	}

}
