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
		assertEquals("", sol.reverseWords(""));
		assertEquals("", sol.reverseWords("  "));
	}
	
	@Test
	public void testNormal() {
		assertEquals("blue is sky the", sol.reverseWords("the sky is blue"));
	}
	
	@Test
	public void testLeadingTrailingSpaces() {
		assertEquals("blue is sky the", sol.reverseWords("  the sky is blue  "));
	}
	
	@Test
	public void testMultipleSpacesNormal() {
		assertEquals("blue is sky the", sol.reverseWords("the  sky   is blue"));
	}

}
