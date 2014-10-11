import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestSolution {
	
	Solution sol;

	@Before
	public void setUp() throws Exception {
		sol = new Solution();
	}

	@Test
	public void test() {
		String[] expected = {"((()))", "(()())", "(())()", "()(())", "()()()"};
		assertArrayEquals(expected, sol.generateParenthesis(3).toArray(new String[0]));
	}

}
