package koreait.day14;

import java.util.Arrays;

public class C57_ArraySortEx {
	//문자열 정렬 오름차순
	public static void main(String[] args) {
		int[] nums={34,77,19,56,45,9};
		

        for (int i = 0; i < nums.length-1; i++) {	
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i]> nums[k])   {
                	int tmep = nums[i];	
                    nums[i] = nums[k];	
                    nums[k] = tmep;
                }
            }
        }
        System.out.print(Arrays.toString(nums));
     
        
	}
}
