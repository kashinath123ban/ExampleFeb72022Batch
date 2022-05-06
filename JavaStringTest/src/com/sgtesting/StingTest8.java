package com.sgtesting;

public class StingTest8 {

	public static void main(String[] args) {
		get2();
	}
	private static void get2()
	{
		String s1=new String("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");
		String s=s1.replace("DAY"," ");
		System.out.println(s);
	}

}
