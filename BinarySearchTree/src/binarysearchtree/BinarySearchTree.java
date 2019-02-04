package binarysearchtree;

public class BinarySearchTree {
	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	
	public Node addNewBranch(Node root,int value) {
		if(root == null) {
			root = new Node(value);
			return root;
		}else {
			 if (value < root.getValue()) 
	            root.setLeft(addNewBranch(root.getLeft(), value)); 
	        else if (value > root.getValue()) 
	            root.setRight(addNewBranch(root.getRight(), value));
		}
		
		return root;
	}
	
	public Node deleteBranch(Node root, int value) {
		
		if(root==null) {
			return root;
		}
		
		if(value < root.getValue()) {
			root.setLeft(deleteBranch(root.getLeft(), value));
		}else if(value > root.getValue()) {
			root.setRight(deleteBranch(root.getRight(), value));
		}else {
			
			if(root.getLeft() == null && root.getRight() == null) {
				return null;
			}else if(root.getLeft() == null) {
				return root.getRight();
			}else if(root.getRight() == null) {
				return root.getLeft();
			}else {
				int min = leastValue(root.getRight());
				root.setValue(min);
				root.setRight(deleteBranch(root.getRight(), min));
				
			}
			
		}
		
		return root;
	}
	
	public Integer leastValue(Node root) {
		if(root.getLeft() != null) {
			return leastValue(root.getLeft());
		}else {
			return root.getValue();
		}
	}
	
	public void inOrderTraversal(Node root) {
		if(root!=null) {
			inOrderTraversal(root.getLeft()); 
            System.out.print(root.getValue()); 
            System.out.print(" ");
            inOrderTraversal(root.getRight());
		}
	}
}
