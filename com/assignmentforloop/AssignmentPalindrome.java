package com.assignmentforloop;

public class AssignmentPalindrome {
	public static void main(String[] args)
	{
		int num=121,sum=0;
		int rev=0,i;
		for(i=num;i>0;i=i/10);
		{
			rev=(i%10);
			sum=(sum*10)+rev;
		}
		if(num==sum)
		{
			System.out.println("no is palindrome");
		}
		else {
			System.out.println("no is not palindrome");
			
		}
	}

}
