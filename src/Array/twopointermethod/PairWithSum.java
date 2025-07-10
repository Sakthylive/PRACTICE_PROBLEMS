package Array.twopointermethod;

public class PairWithSum {

    public static void main(String[] args) {

        //Sorted Array
    int[] arr = {1,3,5,6,9,12};

        System.out.println(hasPairWithSum(arr, 24));
    }

    public static Boolean hasPairWithSum(int[] arr, int target){
        Boolean hasPairWithSum= false;
        int left=0 , right= arr.length-1;
        while(left < right){
            int sum=arr[left] + arr[right];
        if(sum == target)
        return Boolean.TRUE;
        else if ( sum > target)
            right--;
        else
            left++;

        }

        return hasPairWithSum;
    }
}
