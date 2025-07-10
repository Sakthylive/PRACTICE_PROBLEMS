package Array.twopointermethod;

public class WaterContainerProblem {

    public static void main(String[] args) {
        System.out.println(getArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int getArea(int[] arr){
        int left=0, right=arr.length-1;
        int area=0;

        while(left < right){
            int width= right-left;
            area = Math.max(area,width * Math.min(arr[left], arr[right])) ;
            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }

        }
        return area;

    }
}
