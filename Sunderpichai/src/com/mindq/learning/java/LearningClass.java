package com.mindq.learning.java;

public class LearningClass {

	private String variable1 = "old varibale";
	public String variable2 = "adfaf";
	protected String variable3 = "aa";
	String variable4 = "aaaa";

	public String getString() {
		String s = "saidarao";
		return s;
	}

	public int getInt() {
		int a = 20;
		return a;
	}

	public char getChar() {
		char a = 'g';
		return a;
	}
public byte getbyte(){
	byte a=97;
	return a;
}
	public static boolean getBoolean() {
		return false;
	}

	public static void main(String[] args) {
		System.out.println(LearningClass.getBoolean());
		LearningClass learning = new LearningClass();
		System.out.println(learning.getString());
		System.out.println(learning.getChar());
		System.out.println(learning.getInt());
		System.out.println(learning.variable1);
		learning.variable1 = "new varibale";
		System.out.println(learning.variable2);
		System.out.println(learning.variable1);
		System.out.println(learning.variable3);
		System.out.println(learning.variable4);
	}

}
