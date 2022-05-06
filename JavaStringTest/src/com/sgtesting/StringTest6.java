package com.sgtesting;

public class StringTest6 {

	public static void main(String[] args)
	
	{
		get();
	}
private static void get()
{
	String s=("SGTesting provides training on selenium");
char s1[]=s.toCharArray();
int count=0;
for(char c:s1)
{
	System.out.print(c);
	count++;
}
System.out.println(count);
}
}
	

	






