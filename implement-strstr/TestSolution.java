import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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
		assertNull(sol.strStr(null, null));
		assertNull(sol.strStr("haystack", null));
		assertNull(sol.strStr(null, "needle"));

	}

	@Test
	public void testNotFound() {
		assertNull(sol.strStr("haystack", "needle"));
	}


	@Test
	public void testFound() {
		assertEquals("world!", sol.strStr("hello world!", "world"));
	}

	@Test
	public void testNeedleLonger() {
		assertNull(sol.strStr("1", "111"));
	}

	@Test
	public void testNeedleEmpty() {
		assertEquals("bonjour", sol.strStr("bonjour", ""));
	}

}
