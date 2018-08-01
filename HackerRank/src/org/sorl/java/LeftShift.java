package org.sorl.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftShift {

	// Complete the rotLeft function below.
	// writing a new logic with shifting indices of the array.
	public static int[] rotLeft(int[] a, int n) {
		/*
		 * for (int x= 0; x < a.length; x++) { for (int j=0; j < n-1; j++){ a[j] = a[j]
		 * + a[j+1]; //System.out.print(a[j]); a[j+1] = a[j] - a[j+1];
		 * //System.out.print(a[j+1]); a[j] = a[j] - a[j+1]; //System.out.print(a[j]);
		 * //System.out.println(); } } return a; }
		 */
		int[] temp = new int[a.length];
		for (int x = 0; x < a.length; x++) {
			System.out.println("the n value is " + n);
			if (n == 0)
				n = a.length;
			temp[x] = a[(a.length - n)];
			System.out.println("the temp array values at x " + x + " is " + temp[x]);
			n--;
		}
		return temp;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
	//	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] result = rotLeft(a, d);

	/*	for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();
*/
		scanner.close();
	}
}
