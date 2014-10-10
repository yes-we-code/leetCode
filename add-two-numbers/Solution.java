public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode tail = null;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int sum = carry;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			int val = sum % 10;
			carry = sum / 10;
			ListNode node = new ListNode(val);
			if (head == null) {
				head = node;
				tail = node;
			} else {
				tail.next = node;
				tail = node;
			}
		}
		if (carry != 0) {
			ListNode node = new ListNode(carry);
			if (head == null) {
				head = node;
				tail = node;
			} else {
				tail.next = node;
				tail = node;
			}
		}
		return head;
	}
}