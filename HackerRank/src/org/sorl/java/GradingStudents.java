package org.sorl.java;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingStudents {

	/*
	 * Complete the gradingStudents function below.
	 */
	static int[] gradingStudents(int[] grades) {
		/*
		 * Write your code here.
		 */
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > 37 && grades[i] % 5 > 2 && grades[i] % 5 > 0) {
			//	System.out.println("the calc value is " + (int) (Math.ceil(grades[i] / 5) ) + "for " + grades[i]);
				grades[i] = (int) (Math.ceil(grades[i] / 5) * 5 + 5);
			//	System.out.println(grades[i]);
			}
			Arrays.stream(grades);
		}
		return grades;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bw = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] grades = new int[n];

		for (int gradesItr = 0; gradesItr < n; gradesItr++) {
			int gradesItem = Integer.parseInt(scan.nextLine().trim());
			grades[gradesItr] = gradesItem;
		}

		int[] result = gradingStudents(grades);

		/*
		 * for (int resultItr = 0; resultItr < result.length; resultItr++) {
		 * bw.write(String.valueOf(result[resultItr]));
		 * 
		 * if (resultItr != result.length - 1) { bw.write("\n"); } }
		 */
		// bw.newLine();

		// bw.close();
	}
}
