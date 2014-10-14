import static org.junit.Assert.assertArrayEquals;
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
	public void testNull() {
		assertEquals(0, sol.removeDuplicates(null));
	}

	@Test
	public void testEmpty() {
		assertEquals(0, sol.removeDuplicates(new int[0]));
	}

	@Test
	public void testSample() {
		int[] A = {1, 1, 2};
		assertEquals(2, sol.removeDuplicates(A));
		assertEquals(1, A[0]);
		assertEquals(2, A[1]);
	}

	@Test
	public void testAnother() {
		int[] A = {1, 2, 2};
		assertEquals(2, sol.removeDuplicates(A));
		assertEquals(1, A[0]);
		assertEquals(2, A[1]);
	}

	@Test
	public void testUnique() {
		int[] A = {1, 2, 3};
		int[] expected = {1, 2, 3};
		assertEquals(3, sol.removeDuplicates(A));
		assertArrayEquals(expected, A);
	}

}
