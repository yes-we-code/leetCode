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
	public void testSample() {
		ListNode l1 = ListNode.parseListNode("2 -> 4 -> 3");
		ListNode l2 = ListNode.parseListNode("5 -> 6 -> 4");
		assertEquals("7 -> 0 -> 8", sol.addTwoNumbers(l1, l2).toString());
	}
	
	@Test
	public void testL1Null() {
		ListNode l1 = null;
		ListNode l2 = ListNode.parseListNode("5 -> 6 -> 4");
		assertEquals("5 -> 6 -> 4", sol.addTwoNumbers(l1, l2).toString());
	}
	
	@Test
	public void testL2Null() {
		ListNode l1 = ListNode.parseListNode("2 -> 4 -> 3");
		ListNode l2 = null;
		assertEquals("2 -> 4 -> 3", sol.addTwoNumbers(l1, l2).toString());
	}
	
	@Test
	public void testBothNull() {
		assertEquals(null, sol.addTwoNumbers(null, null));
	}
	
	@Test
	public void testCarry() {
		ListNode l1 = ListNode.parseListNode("9 -> 9 -> 9");
		ListNode l2 = ListNode.parseListNode("1");
		assertEquals("0 -> 0 -> 0 -> 1", sol.addTwoNumbers(l1, l2).toString());
	}

}
