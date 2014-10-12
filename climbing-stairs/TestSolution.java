import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestSolution {

	Solution sol;

	@Before
	public void setUp() throws Exception {
		sol = new Solution();
	}

	@Test
	public void testNegative() {
		assertEquals(0, sol.climbStairs(-10));
	}

	@Test
	public void testZero() {
		assertEquals(1, sol.climbStairs(0));
	}

	@Test
	public void testOne() {
		assertEquals(1, sol.climbStairs(1));
	}

	@Test
	public void testTwo() {
		assertEquals(2, sol.climbStairs(2));
	}

	@Test
	public void testNormal() {
		assertEquals(5, sol.climbStairs(4));
	}
}
