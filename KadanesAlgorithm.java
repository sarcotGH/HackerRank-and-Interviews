package org.sorl.java;

public class KadanesAlgorithm {
	public static void main(String arge[]) {
		int[] a = { -2, 1, 2, -1, 5, 8, 2, 5, -1, 6 };
		int globalMax = a[0], currMax = 0;
		int startPos = 0, stopPos = 0, step = 0;
		for (int i = 0; i < a.length; i++) {
			currMax = currMax + a[i];
			System.out.println("the current max value is " + currMax);
			if (currMax > globalMax) {
				System.out.println("the currMax is greater than globalMax which is " + currMax + "<=>" + globalMax);
				globalMax = currMax;
				startPos = step;
				stopPos = i;
				System.out.println("the subarray start and stop values are " + startPos + " -- " + stopPos);
			}
			if (currMax < 0) {
				currMax = 0;
				step = i + 1;
			}
		}
		System.out.println("the sub array is " + startPos + " thru " + stopPos);
	}
}
