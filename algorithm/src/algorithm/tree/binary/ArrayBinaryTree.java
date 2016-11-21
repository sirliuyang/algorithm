package algorithm.tree.binary;

import java.util.ArrayList;
import java.util.List;

public class ArrayBinaryTree {
	private List<TreeNode> binaryTreeList = new ArrayList<TreeNode>();

	public ArrayBinaryTree() {
	}

	public ArrayBinaryTree(TreeNode... nodes) {
		for (TreeNode node : nodes) {
			binaryTreeList.add(node);
		}
		init();
	}

	private void init() {
		int size = binaryTreeList.size();
		for (int i = 0; i < size; i++) {
			TreeNode node = binaryTreeList.get(i);
			node.setKey(i);
			if (2 * i + 1 <= size) {
				node.setLeftChild(binaryTreeList.get(2 * i + 1));
			}
			if (2 * i + 2 < size) {
				node.setRightChild(binaryTreeList.get(2 * i + 2));
			}
		}
	}

	public List<TreeNode> getBinaryTreeList() {
		return this.binaryTreeList;
	}

	public void insertNode() {

	}

	public void deleteNode() {

	}

	public void updateNode() {

	}

	public void findNode() {

	}
}
