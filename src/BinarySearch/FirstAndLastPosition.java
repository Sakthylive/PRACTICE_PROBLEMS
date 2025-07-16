package BinarySearch;
/* This is a Leet code problem to find first and last position of an element in a sorted array.
 * The solution uses binary search to find the first and last positions of the target element.
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */


public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        int[] result = searchRange(arr, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirstPosition(nums, target);
        int last = findLastPosition(nums, target);
        return new int[]{first, last};
    }

    public static int findFirstPosition(int[] nums, int target){
        int position = -1;
        int start=0,last=nums.length-1;
        while(start <= last){
             int mid= (start+last)/2;
             if(nums[mid] < target) {
                 start = mid + 1;
             }else if ( nums[mid] > target) {
                 last = mid-1;
             }else{
                 position = mid;
                 last= mid-1;
             }
        }
        return position;
    }

    public static int findLastPosition(int[] nums, int target){
        int position = -1;
        int start=0,last=nums.length-1;
        while(start<=last){
            int mid= (start+last)/2;
            if(nums[mid] < target) {
                start = mid + 1;
            }else if ( nums[mid] > target) {
                last = mid-1;
            }else{
                position = mid;
                start= mid+1;
            }
        }
        return position;
    }
}
