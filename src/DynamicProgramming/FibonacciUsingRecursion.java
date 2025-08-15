package DynamicProgramming;

public class FibonacciUsingRecursion {

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
