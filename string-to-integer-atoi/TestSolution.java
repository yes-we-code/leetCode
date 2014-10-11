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
	public void testNonDigit() {
		assertEquals(0, sol.atoi("abc"));
	}
	
	@Test
	public void testNormal() {
		assertEquals(123456789, sol.atoi("123456789"));
	}
	
	@Test
	public void testSpaces() {
		assertEquals(6, sol.atoi("  6  "));
	}
	
	@Test
	public void testPositive() {
		assertEquals(100, sol.atoi("+100"));
	}
	
	@Test
	public void testNegative() {
		assertEquals(-100, sol.atoi("-100"));
	}
	
	@Test
	public void testIntMaxM1() {
		assertEquals(Integer.MAX_VALUE-1, sol.atoi("2147483646"));
	}
	
	@Test
	public void testIntMinP1() {
		assertEquals(Integer.MIN_VALUE+1, sol.atoi("-2147483647"));
	}

	@Test
	public void testIntMax() {
		assertEquals(Integer.MAX_VALUE, sol.atoi("2147483647"));
	}
	
	@Test
	public void testIntMin() {
		assertEquals(Integer.MIN_VALUE, sol.atoi("-2147483648"));
	}

	@Test
	public void testIntMaxP1() {
		assertEquals(Integer.MAX_VALUE, sol.atoi("2147483648"));
	}
	
	@Test
	public void testIntMinM1() {
		assertEquals(Integer.MIN_VALUE, sol.atoi("-2147483649"));
	}
	
	@Test
	public void testBigPositive() {
		assertEquals(Integer.MAX_VALUE, sol.atoi("+9876543210"));
	}
	
	@Test
	public void testBigNegative() {
		assertEquals(Integer.MIN_VALUE, sol.atoi("-9876543210"));
	}

}
