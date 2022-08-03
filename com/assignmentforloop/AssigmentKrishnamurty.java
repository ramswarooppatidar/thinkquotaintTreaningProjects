package com.assignmentforloop;
import java.util.Scanner;
public class AssigmentKrishnamurty {
	public static void main(String[] args) {
		System.out.println("please enter digit you");
		int num,remendar;
		int factorial=1;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		while(num>0)
		{
			remendar=num%10;
			int i=1;
			while(i<=remendar)
			{
				factorial=factorial*i;
				i++;
			}
                sum=sum+factorial;
			    num=num/10;
		}
		System.out.println(sum);
		
		if(sum==num) {
			System.out.println("given number is Krishnamurthy");
		}
		else {
			System.out.println("given number is not Krishnamurthy");
			
			
		}
	}
}

