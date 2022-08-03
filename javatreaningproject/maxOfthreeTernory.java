package javatreaningproject;
import java.util.Scanner;
public class maxOfthreeTernory {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter num1");
		num1=sc.nextInt();
		
		System.out.println("pls enter num2");
		num2=sc.nextInt();
		
		System.out.println("pls enter num2");
		num3=sc.nextInt();
		String maximum =num1>num2 && num1>num3?num1+
				" num1 s maximum":num2>num3?num2+" num2 is maximum":num3+" num3 is maximum";
		System.out.println(maximum);
	}
	

}

// no1=8
//no2= 12
//no3 = 3