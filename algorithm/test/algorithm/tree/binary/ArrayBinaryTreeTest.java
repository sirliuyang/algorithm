package algorithm.tree.binary;

import java.util.List;

public class ArrayBinaryTreeTest {
	public static void main(String[] args){
		TreeNode[] nodes = new TreeNode[8];
		nodes[0] = new TreeNode("A");
		nodes[1] = new TreeNode("B");
		nodes[2] = new TreeNode("C");
		nodes[3] = new TreeNode("D");
		nodes[4] = new TreeNode("E");
		nodes[5] = new TreeNode("F");
		nodes[6] = new TreeNode("G");
		nodes[7] = new TreeNode("H");
		
		ArrayBinaryTree binaryTree = new ArrayBinaryTree(nodes);
		List<TreeNode> list = binaryTree.getBinaryTreeList();
		System.out.println(list.get(2).getRightChild().getValue());
	}
}
