public class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
	
	public static ListNode parseListNode(String s) {
		if (s == null || s.isEmpty()) {
			return null;
		}
		ListNode head = null;
		ListNode tail = null;
		String[] vals = s.split("->");
		for (int i = 0; i < vals.length; i++) {
			int val = Integer.parseInt(vals[i].trim());
			ListNode node = new ListNode(val);
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
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(val);
		if (next != null) {
			sb.append(" -> ");
			sb.append(next.toString());
		}
		return sb.toString();
	}
}
