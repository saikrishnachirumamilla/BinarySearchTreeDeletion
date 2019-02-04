package binarysearchtree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		Integer[] arr = new Integer[] {150,130,110,140,100,120,135,145,170,160,180,155,165,175,185};
		List<Integer> list = Arrays.asList(arr);
		
		System.out.print("Elements inserted: ");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			System.out.print(" ");
		}
		
		System.out.println("");
		
		
		for (int i = 0; i < list.size(); i++) {
			binarySearchTree.setRoot(binarySearchTree.addNewBranch(binarySearchTree.getRoot(),list.get(i)));
		}
		System.out.print("Elements before deletion: ");
		binarySearchTree.inOrderTraversal(binarySearchTree.getRoot());
		System.out.println("");
		
		Scanner reader = new Scanner(System.in); 
		System.out.print("\nEnter a leaf node: ");
		int value = reader.nextInt();

		
		binarySearchTree.setRoot(binarySearchTree.deleteBranch(binarySearchTree.getRoot(), value));
		System.out.print("Elements after deletion: ");
		binarySearchTree.inOrderTraversal(binarySearchTree.getRoot());
		
		System.out.println("");
		System.out.print("\nEnter a node that has subtree: ");
		int value1 = reader.nextInt();
		reader.close();
		
		binarySearchTree.setRoot(binarySearchTree.deleteBranch(binarySearchTree.getRoot(), value1));
		System.out.print("Elements after deletion: ");
		binarySearchTree.inOrderTraversal(binarySearchTree.getRoot());
		
		
	}

}
