package DynamicProgramming;

public class FibonacciUsingRecursion {
//this method is for finding fibonacci of a given number without using dynamic programming
    // this will be using recursion
    public static void main(String[] args) {
        FibonacciUsingRecursion fibo = new FibonacciUsingRecursion();
        int n=10;
        for(int i=0;i<=n;i++) {
            System.out.println(fibo.getfibo(i));
        }
    }

    public int getfibo(int n){
        if(n<=1){
            return n;
        }
        return getfibo(n-1)+getfibo(n-2);
    }
}
