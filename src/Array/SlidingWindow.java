package Array;

public class SlidingWindow {


    public static void main(String[] args) {
    int[] arr={10,3,9,3,2,1,9};
    int sum=0, length=arr.length, k=3;
        getSumOfSubArray(k, arr);
    }

    public static  int getSumOfSubArray(int k, int[] arr){
        int sum=0;
        int n=arr.length;

        for( int i=0; i<k;i++){
            sum= sum+arr[i];
        }
        System.out.println(sum);

        for ( int i=1; i<= n-k;i++){
            sum= sum-arr[i-1]+arr[i+k-1];
            System.out.println(sum);
        }

        return sum;
    }

}
