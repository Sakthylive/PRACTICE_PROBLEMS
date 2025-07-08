package String;

public class Palindrome {
    public static void main(String[] args) {
    System.out.println(isPalindrome("CURRUC"));
    }

    public static Boolean isPalindrome(String str){
        Boolean isPalindrome = false;
        String reversedStr = "";

        char[] char1 = str.toCharArray();

        for (int i=char1.length-1;i>=0;i--) {
            reversedStr=reversedStr.concat(String.valueOf(char1[i]));
        }
        if(str.equals(reversedStr)){
            isPalindrome=Boolean.TRUE;
        }

        return isPalindrome;
    }
}
