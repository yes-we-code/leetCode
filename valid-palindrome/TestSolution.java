import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class TestSolution {

	Solution sol;

	@Before
	public void setUp() throws Exception {
		sol = new Solution();
	}

	@Test
	public void testEmpty() {
		assertTrue(sol.isPalindrome(""));
	}

	@Test
	public void testValid() {
		assertTrue(sol.isPalindrome("A man, a plan, a canal: Panama"));
	}

	@Test
	public void testInvalid() {
		assertFalse(sol.isPalindrome("race a car"));
	}

}
