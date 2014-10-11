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
	public void testValid() {
		assertTrue(sol.isValid("()"));
		assertTrue(sol.isValid("()[]{}"));
	}

	@Test
	public void testInvalid() {
		assertFalse(sol.isValid("(]"));
		assertFalse(sol.isValid("([)]"));
		assertFalse(sol.isValid("]"));
	}

}
