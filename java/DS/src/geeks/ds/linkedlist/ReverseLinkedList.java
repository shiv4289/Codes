package geeks.ds.linkedlist;

public class ReverseLinkedList {

	public static void main(String args[]){
		LLNode head = new LLNode();
		head.makeSample(85,15,4,20);
		LLUtils.print(head);
//		LLUtils.printReverse(head);
		head =LLUtils.reverse(head);
		LLUtils.print(head);
		head = LLUtils.reverse(head, 2);
		LLUtils.print(head);
	}
}
