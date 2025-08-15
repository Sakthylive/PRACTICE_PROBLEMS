package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FiboUsingMemoization {
    public static void main(String[] args) {
        FiboUsingMemoization fibo = new FiboUsingMemoization();
        int n=10;
        int[] mem = new int[n+1];
        Arrays.fill(mem,-1);
        System.out.println(fibo.getfibo(n,mem));
    }

    public int getfibo(int n, int[] mem){
        if(n<=1){
            return n;
        }
        if(mem[n] != -1){
            return mem[n];
        }
        mem[n] =  getfibo(n-1,mem)+getfibo(n-2,mem);
        return mem[n];
    }
}
