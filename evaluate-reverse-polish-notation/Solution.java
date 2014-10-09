import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int evalRPN(String[] tokens) {
    	Deque<Integer> stack = new ArrayDeque<Integer>();
    	for (int i = 0; i < tokens.length; i++) {
    		if (tokens[i].equals("+")) {
    			int i1 = stack.pop();
    			int i2 = stack.pop();
    			stack.push(i2 + i1);
    		} else if (tokens[i].equals("-")) {
    			int i1 = stack.pop();
    			int i2 = stack.pop();
    			stack.push(i2 - i1);
    		} else if (tokens[i].equals("*")) {
    			int i1 = stack.pop();
    			int i2 = stack.pop();
    			stack.push(i2 * i1);
    		} else if (tokens[i].equals("/")) {
    			int i1 = stack.pop();
    			int i2 = stack.pop();
    			stack.push(i2 / i1);
    		} else {
    			stack.push(Integer.parseInt(tokens[i]));
    		}
    	}
    	return stack.pop();
    }
}