package org.sorl.java;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CreateMinimalBST {

	// create an inner class to create the binary Tree's data structure

	private Node root;

	private class Node {
		private Node left;
		private Node right;
		private int data;

		public Node(int data) {
			this.data = data;
		}

		public void insert(int value) {
			if (value <= data) {
				if (left == null) {
					left = new Node(value);
				} else {
					left.insert(value);
				}
			} else {
				if (right == null) {
					right = new Node(value);
				} else {
					right.insert(value);
				}
			}
		}

		public boolean contains(int value) {
			if (data == value) {
				return true;
			} else if (value < data) {
				if (left == null) {
					return false;
				} else {
					return left.contains(value);
				}
			} else {
				if (right == null) {
					return false;
				} else {
					return right.contains(value);
				}
			}
		}

		/*
		 * In order printing of Binary Tree
		 * 
		 * Sequence is left, root, right
		 */
		public void printInOrder() {
			if (left != null)
				left.printInOrder();
			System.out.println(data);
			if (right != null)
				right.printInOrder();
		}

		/*
		 * PreOrder printing of Binary Tree
		 * 
		 * Sequence is root, left right
		 */
		public void printPreOrder() {
			System.out.println(data);
			if (left != null)
				left.printInOrder();
			if (right != null)
				right.printInOrder();

		}

		/*
		 * PostOrder printing of Binary Tree
		 * 
		 * Sequence is left, right, root
		 */
		public void printPostOrder() {
			if (left != null)
				left.printInOrder();
			if (right != null)
				right.printInOrder();
			System.out.println(data);
		}

	}

	/*
	 * Java program which accepts array elements in a space seperated line and
	 * creates a Binary .
	 */

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number of elements in the ");
		int arraySize = in.nextInt();
		String theElements = in.nextLine();
		StringTokenizer st = new StringTokenizer(theElements, " ");
		int[] theArray = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			while (st.hasMoreTokens()) {
				theArray[i] = Integer.parseInt(st.nextToken());
			}
		}
		// buildBinary(theArray, theArray[0], theArray.length -1);
		createBinary();
	}

	private static void createBinary() {
		// TODO Auto-generated method stub
	/*	Node first = new Node(1);
		Node second = new Node(4);
		Node third = new Node(3);
		Node fourth = new Node(2);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		*/

		// just another todo to be taken care of.
	}
}
