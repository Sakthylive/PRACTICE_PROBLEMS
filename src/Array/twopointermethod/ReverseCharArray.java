package Array.twopointermethod;

public class ReverseCharArray {
    public static void main(String[] args) {
        char[] arr={'r','e','v','e','r'};
        System.out.println(getReverse(arr));

    }

    public static char[] getReverse(char[] arr){

        int left=0, right=arr.length-1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
