package DynamicProgramming;

public class FibonacciWithoutRecursion {
    static int i=0;
    static int j=1;
    static int k;
    static int count=10;

    public static void main(String[] args) {

        System.out.println(i+"\n"+j);
    for(int a=2; a<=count; a++){
        k=i+j;
        i=j;
        j=k;
        System.out.println(k);
    }
    }


}
