import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestSolution {
	
	Solution sol;
	
	@Before
	public void setUp() {
		sol = new Solution();
	}

	@Test
	public void testExpr1() {
		String[] tokens = {"2", "1", "+", "3", "*"};
		assertEquals(9, sol.evalRPN(tokens));
	}
	
	@Test
	public void testExpr2() {
		String[] tokens = {"4", "13", "5", "/", "+"};
		assertEquals(6, sol.evalRPN(tokens));
	}

}
