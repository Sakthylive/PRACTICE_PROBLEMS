package Testpackage;

import java.util.HashSet;

public class FindDuplicate {


    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,3};
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums){
        boolean isduplicate = false;
        HashSet<Integer> numList = new HashSet<>();
        if(nums.length <=1){
            return Boolean.FALSE;
        }

        for (int num : nums) {

            if(numList.contains(num)){
                isduplicate= Boolean.TRUE;
                return isduplicate;
            }
            numList.add(num);

        }
        return isduplicate;
    }
}
