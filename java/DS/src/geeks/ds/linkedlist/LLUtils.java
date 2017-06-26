package geeks.ds.linkedlist;

public class LLUtils {

	public static void print(LLNode head) {
		while(head != null){
			System.out.print(" " + head.data);
			head=head.next;
		}
		System.out.println();
	}

	public static LLNode reverse(LLNode head) {
		LLNode prev= null;
		LLNode cur= head;
		LLNode next = null;

		while(cur != null){
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		head = prev;
		return head;
	}

	public static void printReverse(LLNode head){
		printReverseRecur(head);
		System.out.println();
	}

	private static void printReverseRecur(LLNode head) {
		if (head == null)
			return;

		printReverseRecur(head.next);
		System.out.print(" " + head.data);		
	}

	public static LLNode reverse(LLNode head, int k) {
		LLNode prev = null;
		LLNode cur = head;
		LLNode next = null;
		int count = 0;

		while(cur != null && count < k){
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
			count++;
		}

		if (cur != null){
			head.next = reverse(cur, k);
		}

		return prev;
	}
}
