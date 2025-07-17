package BinarySearch;

public class FindMinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {11,12, 1,2,3,4,5,6,7,8,9,10};
        System.out.println("the min num is "+findMin(arr));
    }

    public static int findMin(int[] arr){
        int min=arr[0];
        int start=0, last=arr.length-1;

        while(start <= last){
            int mid= (start+last)/2;
            if(arr[mid] >= arr[0]){
               start= mid+1;
            }else {
                min=arr[mid];
               last=mid-1;
            }
        }
        return min;
    }
}
