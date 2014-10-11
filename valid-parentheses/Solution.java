import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean isValid(String s) {
		Map<Character, Character> match = new HashMap<>();
		match.put('(', ')');
		match.put('[', ']');
		match.put('{', '}');
		Deque<Character> stack = new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (match.keySet().contains(ch)) {
				stack.push(ch);
			} else {
				if (!stack.isEmpty() && match.get(stack.peek()) == ch) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}