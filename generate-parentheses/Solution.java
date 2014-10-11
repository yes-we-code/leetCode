import java.util.ArrayList;
import java.util.List;

public class Solution {
	private void generateParenthesis(int m, int n, String s, List<String> list) {
		if (m < 0 || n < 0) {
			return;
		}
		if (m == 0 && n == 0) {
			list.add(s);
			return;
		}
		if (m == n) {
			generateParenthesis(m-1, n, s+"(", list);
		} else {
			generateParenthesis(m-1, n, s+"(", list);
			generateParenthesis(m, n-1, s+")", list);
		}
	}
	
    public List<String> generateParenthesis(int n) {
    	List<String> list = new ArrayList<>();
    	generateParenthesis(n, n, "", list);
    	return list;
    }
}