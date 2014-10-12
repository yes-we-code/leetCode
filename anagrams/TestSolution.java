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
	public void testExample() {
		String[] strs = { "cat", "rye", "aye", "dog", "god", "cud", "cat",
				"old", "fop", "bra" };
		assertEquals(4, sol.anagrams(strs).size());
		assertEquals("cat", sol.anagrams(strs).get(0));
		assertEquals("cat", sol.anagrams(strs).get(1));
		assertEquals("dog", sol.anagrams(strs).get(2));
		assertEquals("god", sol.anagrams(strs).get(3));
	}

	@Test
	public void testNormalization() {
		assertEquals("act", sol.normalize("cat"));
		assertEquals("dgo", sol.normalize("dog"));
		assertEquals("dgo", sol.normalize("god"));
	}

}
