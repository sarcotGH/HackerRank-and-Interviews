package org.sorl.java;
import java.util.Scanner;

/*
 * A sequence of integers is called a zigzag sequence if each of its elements is either strictly less than all its neighbors 
 * or strictly greater than all its neighbors. For example, the sequence 4 2 3 1 5 3 is a zigzag, but 7 3 5 5 2 and 3 8 6 4 5 aren't. 
 * Sequence of length 1 is also a zigzag.
 */
public class ZigZag {

	public static void main (String args[]) {
		int [] a =  {9, 8, 8, 5, 3, 5, 3, 2, 8, 6};
		int [] b =  {4, 4};
		int [] c = {2, 1, 4, 4, 1, 4, 4, 1, 2, 0, 1, 0, 0, 3, 1, 3, 4, 1, 3, 4};
		System.out.println(checkZigZag(a));
		System.out.println(checkZigZag(b));
		System.out.println(checkZigZag(c));
	}

	/*
	 * a function to check if the given array is zig zag and return
	 * the count of zig zags per the question
	 */
	private static int checkZigZag(int[] a) {
		int count = 0;
		// TODO Auto-generated method stub
		if (a.length == 1) return 1;
		if (a.length == 2 && a[0] == a[1]) return 1;
		if (a.length == 2 && (a[0] != a[1])) return 0;
		else {
			for (int i=1; i <= a.length-2; i++) {
			// this iteration will start from the 3rd variable where i = 2
				System.out.println("working on the " + i + "the counter with values" + a[i-1] + ", " + a[i] + ", " + a[i+1] );
				if ((a[i-1] < a[i] && a[i+1] < a[i]) || 
						(a[i-1] > a[i] && a[i+1] > a[i]) ) count++;
				System.out.println("count value is " + count); 
			}
		}
		return count;
	}
	
}
