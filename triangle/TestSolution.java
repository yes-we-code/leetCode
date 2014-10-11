
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
		List<List<Integer>> triangle = new ArrayList<>();
		assertEquals(0, sol.minimumTotal(triangle));
	}
	
	@Test
	public void testTrivial() {
		List<List<Integer>> triangle = new ArrayList<>();
		List<Integer> row;
		row = new ArrayList<>();
		row.add(2);
		triangle.add(row);
		assertEquals(2, sol.minimumTotal(triangle));
	}
	
	@Test
	public void testSample() {
		List<List<Integer>> triangle = new ArrayList<>();
		List<Integer> row;
		row = new ArrayList<>();
		row.add(2);
		triangle.add(row);
		row = new ArrayList<>();
		row.add(3);
		row.add(4);
		triangle.add(row);
		row = new ArrayList<>();
		row.add(6);
		row.add(5);
		row.add(7);
		triangle.add(row);
		row = new ArrayList<>();
		row.add(4);
		row.add(1);
		row.add(8);
		row.add(3);
		triangle.add(row);
		assertEquals(11, sol.minimumTotal(triangle));
	}

}
