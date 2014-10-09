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
	public void testEmpty() {
		assertFalse(sol.isNumber(""));
		assertFalse(sol.isNumber("-"));	
		assertFalse(sol.isNumber("."));		
	}
	
	@Test
	public void testInteger() {
		assertTrue(sol.isNumber("0"));
	}
	
	@Test
	public void testFloat() {
		assertTrue(sol.isNumber(".1"));
		assertTrue(sol.isNumber("3."));
		assertTrue(sol.isNumber("+.8"));
		assertTrue(sol.isNumber(" 0.1 "));
	}

	@Test
	public void testLetter() {
		assertFalse(sol.isNumber("abc"));
	}
	
	@Test
	public void testMixed() {
		assertFalse(sol.isNumber("1 a"));
	}
	
	@Test
	public void testScientific() {
		assertTrue(sol.isNumber("2e10"));
	}
	
	@Test
	public void testBrokenScientific() {
		assertFalse(sol.isNumber("e9"));
	}
	
	@Test
	public void testSuffix() {
		assertFalse(sol.isNumber("959440.94f"));
		assertFalse(sol.isNumber("84656e656D"));
	}
}
