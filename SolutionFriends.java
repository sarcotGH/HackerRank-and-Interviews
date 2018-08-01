package org.sorl.java;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SolutionFriends {
	
	static int shorty(int[] theArray) {
		int shortestVal = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int x=0; x < theArray.length; x++ ) {
			al.add(theArray[x]);
		}
		System.out.println("the integer array as Array list is " + al);
		System.out.println("the sorted al is " + al);
		return 0;
		
	}
	
	public static void main(String[] args) {
		int[] anArray = { 5, 3, 6, 2, 8, 9, 1,0 };
		
		System.out.println(shorty(anArray));
	}

	
}
