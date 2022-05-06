package com.sgtesting;

public class StringTest {

	public static void main(String[] args) {
		String s1=new String("java");//two object created in heap and scp memory
		String s2="java";//one object in scp memory
		System.out.println(s1);
        System.out.println(s2);
	}
}
