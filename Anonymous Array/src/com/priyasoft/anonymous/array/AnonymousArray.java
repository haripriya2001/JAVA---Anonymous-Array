package com.priyasoft.anonymous.array;
class Bank{
	public void display_All_Customer_Names(String[] custNames)
	{
		for(String cnames: custNames )
		{
			System.out.println(cnames);
		}
	}
}

public class AnonymousArray {

	public static void main(String[] args) {
		Bank b= new Bank();
		b.display_All_Customer_Names(new String[]{"aaa","bbb","ccc","ddd"});
		

	}

}
