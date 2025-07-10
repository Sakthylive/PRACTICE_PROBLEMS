package Array.twopointermethod;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static Boolean isPalindrome(String str){
        str=str.replaceAll("[^a-zA-Z0-9]", "");
        int left=0;
        int right=str.length()-1;
        Boolean isPalindrome = true;
        if(str.length() ==1){
            isPalindrome=true;
        }

        while(left < right){
           if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
               return false;
           }else{
               left++;
               right--;
           }

           }


        return isPalindrome;
    }
}
