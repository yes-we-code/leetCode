import static org.junit.Assert.*;

import java.util.Arrays;

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
		assertNull(sol.generate(-10));
	}

	@Test
	public void testZero() {
		assertEquals(0, sol.generate(0).size());
	}

	@Test
	public void testSample() {
		assertEquals("[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]",
				Arrays.deepToString(sol.generate(5).toArray()));
	}
}
