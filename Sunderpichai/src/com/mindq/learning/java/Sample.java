package com.mindq.learning.java;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		System.out.println("enter a value");
		int i, j, n;

		n = s.nextInt();
		for (i = 1; i < n; i++) {
		System.out.println(i);
		}
		System.out.print("\n");
		for (j = 1; j <= i; j++){
			System.out.println(j);
			System.out.print(i);
		}
}
}
