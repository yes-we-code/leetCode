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
	public void testExample() {
		int[] A = {1, 2 ,1, 3 ,1 ,1};
		assertEquals(2, sol.removeElement(A, 1));
		System.err.println(Arrays.toString(A));
	}

}
