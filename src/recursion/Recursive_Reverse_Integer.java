package recursion;

public class Recursive_Reverse_Integer {


    //This code needs to be corrected. this is not working..

    public static void main(String[] args) {
    System.out.println(reverse(123));
    }

    public static int reverse(int n){
        int temp = n%10;
         reverse(n/10);

return temp;


    }
}
