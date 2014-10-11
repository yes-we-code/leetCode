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
	public void testEdge1() {
		int[][] matrix = { { 1, 0 } };
		int[][] expect = { { 0, 0 } };
		sol.setZeroes(matrix);
		assertArrayEquals(expect, matrix);
	}

	@Test
	public void testEdge2() {
		int[][] matrix = { { 0, 1 } };
		int[][] expect = { { 0, 0 } };
		sol.setZeroes(matrix);
		assertArrayEquals(expect, matrix);
	}

	@Test
	public void testEdge3() {
		int[][] matrix = { { 0 }, { 1 } };
		int[][] expect = { { 0 }, { 0 } };
		sol.setZeroes(matrix);
		assertArrayEquals(expect, matrix);
	}

	@Test
	public void testEdge4() {
		int[][] matrix = { { 1 } };
		int[][] expect = { { 1 } };
		sol.setZeroes(matrix);
		assertArrayEquals(expect, matrix);
	}

	@Test
	public void testNormal() {
		int[][] matrix = { { 0, 0, 0, 5 }, { 4, 3, 1, 4 }, { 0, 1, 1, 4 },
				{ 1, 2, 1, 3 }, { 0, 0, 1, 1 } };
		int[][] expect = { { 0, 0, 0, 0 }, { 0, 0, 0, 4 }, { 0, 0, 0, 0 },
				{ 0, 0, 0, 3 }, { 0, 0, 0, 0 } };
		sol.setZeroes(matrix);
		assertArrayEquals(expect, matrix);
	}

}
