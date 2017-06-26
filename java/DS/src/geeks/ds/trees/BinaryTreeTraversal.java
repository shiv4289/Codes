package geeks.ds.trees;

public class BinaryTreeTraversal extends BinaryTree{

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.makeSample(1,2,3,4,5);

		tree.preorder();
		tree.postorder();
		tree.inorder();

		tree.inorderWithoutRecursion();
		
		tree.levelOrderHeightWise();
		tree.LevelOrderUsingBFS(); // BFS
	}

}
