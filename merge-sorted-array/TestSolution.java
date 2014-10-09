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
	public void testTrivial1() {
		int[] A = { 1, 2, 3, 0, 0, 0 };
		int[] B = { 4, 5, 6 };
		sol.merge(A, 3, B, 3);
		int[] merged = { 1, 2, 3, 4, 5, 6 };
		assertArrayEquals(merged, A);
	}

	@Test
	public void testTrivial2() {
		int[] A = { 4, 5, 6, 0, 0, 0 };
		int[] B = { 1, 2, 3 };
		sol.merge(A, 3, B, 3);
		int[] merged = { 1, 2, 3, 4, 5, 6 };
		assertArrayEquals(merged, A);
	}

	@Test
	public void testNormal() {
		int[] A = { 2, 4, 6, 0, 0, 0 };
		int[] B = { 1, 3, 5 };
		sol.merge(A, 3, B, 3);
		int[] merged = { 1, 2, 3, 4, 5, 6 };
		assertArrayEquals(merged, A);
	}

}
