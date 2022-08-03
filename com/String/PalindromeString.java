package com.String;
import java.util.Scanner;
class Palindrome{
	public void chack_palindrome(String s) {
		String revrce="";
		for(int i=s.length()-1;i>=0;i--) {
			revrce+=s.charAt(i);
		}
		if(revrce.equals(s)) {
			System.out.println("string "+s+" is a palindrome ");
		}
		else
			System.out.println("not a palindrome");
	}
		/*boolean flag= true;
		String []s1 = s.split(" ");
		String s2[] = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			for (int j=0;j<s1[i].length();j++) {
				s1[i] = s1[s1.length-1-j];
			}
			if(s2[i]!=s1[i]) {
				flag = false;
				break;
			}
			
		}
		if(flag==true) {
			System.out.println("String is palindrome");
		}
		else
			System.out.println("String is not palindrome");
	}*/
}

public class PalindromeString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j=0;
		while(j<3) {
		System.out.println("plese enter a string"); 
		String str=sc.nextLine();
		Palindrome p = new Palindrome();
		p.chack_palindrome(str);
		j++;
		}
		

		
	}
	
}
		
			
