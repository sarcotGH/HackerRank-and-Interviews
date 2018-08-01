package org.sorl.java;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		String test = in.nextLine();
		StringTokenizer st = new StringTokenizer(test, " ");
		/*while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}*/
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}
}
