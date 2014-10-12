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
	public void testNegative() {
		assertNull(sol.getRow(-10));
	}
	
	@Test
	public void testZero() {
		assertEquals("[1]", sol.getRow(0).toString());
	}
	
	@Test
	public void testSample() {
		assertEquals("[1, 3, 3, 1]", sol.getRow(3).toString());
	}

}
