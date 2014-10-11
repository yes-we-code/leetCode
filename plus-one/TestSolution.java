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
	public void testNormal() {
		int[] expected = { 2, 5 };
		int[] number = { 2, 4 };
		assertEquals(2, number.length);
		assertArrayEquals(expected, sol.plusOne(number));
	}

	@Test
	public void testNines() {
		int[] expected = { 1, 0, 0, 0 };
		int[] nines = { 9, 9, 9 };
		assertEquals(4, nines.length);
		assertArrayEquals(expected, sol.plusOne(nines));
	}
}
