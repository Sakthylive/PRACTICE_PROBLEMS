package BinarySearch;


public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 1;
        binarySearch(arr, target);
    }

    public static void binarySearch(int arr[], int tatget){

        int start=0;
        int end=arr.length-1;

        while( start <= end){
             int mid= (start+end)/2;

             if(arr[mid] > tatget){
                end=mid-1;
             }else if(arr[mid] < tatget){
                start=mid+1;
             }else{
                 System.out.println("Element found at index: " + mid);
                 System.exit(0);
             }
    }
        System.out.println("Element not found");
    }
}
