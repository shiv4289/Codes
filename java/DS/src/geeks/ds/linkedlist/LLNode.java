package geeks.ds.linkedlist;

public class LLNode {
	int data;
	LLNode next;

	public LLNode() {}

	public LLNode(int data) {
		this.data = data;
		this.next = null;
	}

	public void makeSample(int i, int j, int k, int l) {
		this.data = i;
		this.next = new LLNode(j);
		this.next.next = new LLNode(k);
		this.next.next.next= new LLNode(l);
	}

}
