package algorithm.tree.binary;

public class TreeNode {
	private int key=0;
	private String value=null;
	private boolean isVisited=false;
	private TreeNode leftChild=null;
	private TreeNode rightChild=null;
	
	
	public TreeNode(){}
	
	public TreeNode(int key, String value){
		this.key = key;
		this.value = value;
	}
	
	public TreeNode(String value){
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	protected void setKey(int key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
}
