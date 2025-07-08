package Stack;

import java.util.Stack;

public class ValidBracesProblem {

    public static void main(String[] args) {
        String braces= "]";
        System.out.println(isValid(braces));

    }

    public static Boolean isValid( String braces){
        Stack<Character> charStack = new Stack<>();

        char[] braceArray = braces.toCharArray();
        for (char c : braceArray) {

            if (isOpenBrace(c)) {
                charStack.push(c);
            } else {
                if(charStack.size()>0 && isvalidClose(charStack.peek(), c)){
                    charStack.pop();
                }else{
                    return false;
                }
            }
        }
        return charStack.isEmpty();



    }

    public static Boolean isOpenBrace(char brace){
        return brace=='['||brace=='{'||brace=='(';
    }

    public static Boolean isvalidClose(char brace1, char brace2){
        return ( brace1=='[' && brace2==']') || (brace1=='{' && brace2=='}') ||(brace1=='(' && brace2==')');
    }
}



