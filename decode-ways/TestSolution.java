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
	public void testEmpty() {
		assertEquals(0, sol.numDecodings(""));
	}
	
	@Test
	public void testZero() {
		assertEquals(0, sol.numDecodings("0"));
	}

	@Test
	public void testSample() {
		assertEquals(2, sol.numDecodings("12"));
	}

}
