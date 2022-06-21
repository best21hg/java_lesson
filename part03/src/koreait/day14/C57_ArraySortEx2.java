package koreait.day14;

public class C57_ArraySortEx2 {
	//문자열 정렬 오름차순
	public static void main(String[] args) {
		String[] nums={"제니","다현","나연","신비","은하","모모"};
		

        for (int i = 0; i < nums.length; i++) {	
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i].compareTo(nums[k]) >0 ) {
                	String tmep = nums[i];	
                    nums[i] = nums[k];	
                    nums[k] = tmep;
                }
            }
            System.out.println(nums[i]);
        }
    
     
        
	}
}
