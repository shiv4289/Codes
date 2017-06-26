package geeks.ds.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	private BTNode node;

	public BinaryTree(){
		setNode(null);
	}

	public BTNode getNode() {
		return node;
	}

	public void setNode(BTNode node) {
		this.node = node;
	}

	public void makeSample(int i, int j, int k, int l, int m) {
		this.node = new BTNode(i);
		this.node.setLeft(new BTNode(j));
		this.node.setRight(new BTNode(k));
		this.node.getLeft().setLeft(new BTNode(l));
		this.node.getLeft().setRight(new BTNode(m));
	}

	public void inorder() {
		System.out.print("inorder:");
		printInorder(node);
		System.out.println();
	}

	private void printInorder(BTNode node) {

		if (node == null)
			return;

		printInorder(node.getLeft());
		System.out.print(" ");
		System.out.print(node.getData());
		printInorder(node.getRight());
	}

	public void preorder() {
		System.out.print("preorder:");
		printPreOrder(node);
		System.out.println();
	}

	private void printPreOrder(BTNode node) {
		if (node == null)
			return;

		System.out.print(" ");
		System.out.print(node.getData());
		printPreOrder(node.getLeft());
		printPreOrder(node.getRight());
	}

	public void postorder() {
		System.out.print("postorder:");
		printPostOrder(node);
		System.out.println();
	}

	private void printPostOrder(BTNode node) {
		if (node == null)
			return;

		printPostOrder(node.getLeft());
		printPostOrder(node.getRight());
		System.out.print(" ");
		System.out.print(node.getData());
	}

	public void inorderWithoutRecursion() {
		if (node == null)
			return;

		System.out.print("inorder without recursion: ");
		printInorderWithoutRecursion(node);
		System.out.println();
	}

	private void printInorderWithoutRecursion(BTNode node) {
		Stack<BTNode> st = new Stack<BTNode>();
		while(node != null){
			st.push(node);
			node = node.getLeft();		
		}
		
		while(st.isEmpty() == false){
			BTNode poppedNode = st.pop();
			System.out.print(" ");
			System.out.print(poppedNode.getData());

			if (poppedNode.getRight() != null){
				poppedNode = poppedNode.getRight();

				while(poppedNode != null){
					st.push(poppedNode);
					poppedNode = poppedNode.getLeft();
			}
			}
		}
	}

	public void levelOrderHeightWise() {
		System.out.print("Level order: ");
		int height = height(node);

		for (int i = 1 ; i <= height; i++){
			printLevel(node, i);
			//System.out.println();
		}
		System.out.println();
	}

	private void printLevel(BTNode node, int i) {
		if (node == null)
			return;

		if (i == 1)
			System.out.print(" " + node.getData());

		printLevel(node.getLeft(), i-1);
		printLevel(node.getRight(), i-1);
	}

	private int height(BTNode node) {
		if (node == null)
			return 0;

		else{
			int lDepth = height(node.getLeft());
			int rDepth = height(node.getRight());
			return 1 + Math.max(lDepth, rDepth);
		}
	}

	public void LevelOrderUsingBFS() {
		if (node == null)
			return;

		System.out.print("Level order using BFS: ");
		LevelOrderUsingBFS(node);
		System.out.println();
	}

	private void LevelOrderUsingBFS(BTNode node) {
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(node);
		while(q.isEmpty() == false){
			BTNode polledNode = q.poll();
			System.out.print(" " + polledNode.getData());
			if (polledNode.getLeft() != null)
				q.add(polledNode.getLeft());
			if (polledNode.getRight() != null)
				q.add(polledNode.getRight());
		}
	}
}

