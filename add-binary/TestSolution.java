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
	public void testEmptyBoth() {
		assertEquals("", sol.addBinary("", ""));
	}

	@Test
	public void testEmptyA() {
		assertEquals("100", sol.addBinary("", "100"));
	}

	@Test
	public void testEmptyB() {
		assertEquals("100", sol.addBinary("100", ""));
	}

	@Test
	public void testExample() {
		assertEquals("100", sol.addBinary("11", "1"));
	}

}
