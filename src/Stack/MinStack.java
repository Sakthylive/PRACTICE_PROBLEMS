package Stack;

import java.util.Objects;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = null;
    Stack<Integer> auxStack = null;

    public MinStack() {
        stack = new Stack<>();
        auxStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (auxStack.isEmpty() || auxStack.peek() >= val) {
            auxStack.push(val);
        }
    }
    public void pop(){

        if(Objects.equals(stack.peek(), auxStack.peek())){
            auxStack.pop();
        }
        stack.pop();
    }

    public int getMin(){
        return auxStack.peek();
    }

}
