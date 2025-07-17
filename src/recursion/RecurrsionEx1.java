package recursion;

public class RecurrsionEx1 {

    public static void main(String[] args) {
        printNum(10);

    }

    public static int printNum(int n){
        if (n==0) return n;

        System.out.println(printNum(n-1));
        return n;
    }
}
