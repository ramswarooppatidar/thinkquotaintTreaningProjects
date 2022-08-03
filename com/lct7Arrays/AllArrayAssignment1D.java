package com.lct7Arrays;
import java.util.Arrays;
import java.util.Scanner;
class arraysProblems{
	//1  MAXIMUM VALUE OF ARRYS ELEMENT USING SHORTING
	public void maximumValue(int arr[]) {
	    int min = arr[0];
		for (int i = 0;i<arr.length;i++) {
			for (int j=0;j<arr.length-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		for (int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nsecond maximum elemnt of arrys is "+arr[arr.length-2]);
		System.out.println("\nsecond minimum elemnt of arrys is "+arr[1]);

	}
	public void palindrome(int arr[])
	{  
		int copy[] = new int[arr.length];
	    boolean flag=true;
	    for ( int i =0;i<arr.length;i++) {
		    copy[i] = arr[i];
	    }
		
		for ( int i =0;i<arr.length/2;i++) {
			copy[i] = copy[copy.length-i-1];
		}
		for (int i = 0;i<arr.length;i++) {
			if(copy[i]!=arr[i]) {
				flag= false;
				break;
			}
			}
		if(flag==true) {
			System.out.println("number series is palindrome");}
		else
			{
			System.out.println("not palindome");
			
			}
	}

	//2 MARGE ARRY AND ACCENDING ORDER;
				
    		
	public void addArrays(int arr[],int arr1[])
	{
		int c[]=new int[arr.length +arr1.length];
		for(int i=0;i<arr.length;i++) {
			c[i]= arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			c[arr.length+i]= arr1[i];
		}
		System.out.println("marge two arrya arrys1 and array2\n");

		System.out.println(Arrays.toString(c));
		accendingOrder(c);
	}
	// 3 ARRANGE ACCENDING ORDER;
	public void accendingOrder(int arr[]) 
	{
	  for(int i=0;i<arr.length;i++) 
	  {
		  for(int j=0;j<arr.length-i-1;j++)
		  {
			  if(arr[j+1]<arr[j])
			  {
				  int temp = arr[j+1];
				  arr[j+1]=arr[j];
				  arr[j]=temp;
			  }
		  }
	  }
	}
	//4 ELEMENT OCCURANCE HOW MUCH TIMES
	public void frequencyOfElemnt(int arr[]) 
	{
		int fr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			fr[i]=1;
		}
		for(int i=0;i<arr.length;i++) {
			int cnt=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					cnt++;
					fr[j] = 0;
					fr[i] = cnt;
				}
				
			}
			if(fr[i]!=0) {
				System.out.println(arr[i]+" occource "+fr[i]+" times");
			}
			
		}
		System.out.println(Arrays.toString(fr));
		
	}
	// 5 MAXIMUM AND MINIMUM
	public void maximumMinimum(int arr[]) {
		int min = arr[0];
		int max = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("minimum element of arry is"+max);
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("maximum element of arry is: "+min);

	}
	// 6 SEPRATE ARRAY OF EVEN AND ODD
    public void evenOddArrays(int arr[] )
    {
    	int even = 0;
    	for (int i = 0;i<arr.length;i++) {
    		if(arr[i]%2==0) {
    			even++;
    		}
    	}
    	int Even[] = new int[even];
    	int Odd[] = new int[arr.length-even];
    	int k=0;
    	int j=0;
    	for (int i = 0;i<arr.length;i++)
    	{
    		if(arr[i]%2==0) {
    			Even[j]=arr[i];
    			j++;
    			continue;
    		}
    
    			Odd[k] = arr[i];
    			k++;
    	}
    	/* 	if(arr[i]%2==0) {
			Even[j]=arr[i];
			j++;
    	     }
    	     else
    	       Odd[k]=arr[i];
    	*/


    	System.out.println(Arrays.toString(Even));
    	System.out.println(Arrays.toString(Odd));
    }
    // 7 INSERT ELEMENTS IN SHORTING ARRYS
    public void insertElement(int arr[],int num) {
    	int p=0;
    	int b[] = new int[arr.length+1];
    	 for(int i=0;i<arr.length;i++) 
   	  {
   		  for(int j=0;j<arr.length-i-1;j++)
   		  {
   			  if(arr[j+1]<arr[j])
   			  {
   				  int temp = arr[j+1];
   				  arr[j+1]=arr[j];
   				  arr[j]=temp;
   			  }
   		  }
   		  
   	  }
    	 for(int i=0;i<arr.length;i++) {
    		 b[i]=arr[i];
    	 }
    	 //find out position where you insert data
    	 for(int i=0;i<arr.length;i++) {
    		 if(num<arr[i]) {
    			 p = i;
    			 break;
    		 }
    		 else
    			 p = i+1;
    	 }
    	 // move right side arrays elements
    	/* for(int i=arr.length;i>=p;i--) {
    		 arr[i] = arr[i-1]; }*/
    	 for(int i=arr.length;i>=p;i--) {
    		 b[i] = b[i-1]; }
    	 
    	 b[p]=num;
    	 System.out.println(Arrays.toString(b));
 

    }
    // 8 SECOND LARGEST ELEMENT IN ARRAY WITHOUT SHORTING;
    public void secondLargest(int arr[]) {
    	int larg=arr[0],j=0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>larg) {
    			larg=arr[i];
    			j=i;
    		}
    	}
    	int secLarg=arr[0];
    	for(int i=0;i<arr.length;i++) {
    		if(j==i) {
    			i++;
    		}
    		else if(arr[i]>secLarg) {
    			secLarg=arr[i];
    		}
    	}
    	System.out.println("second largest element of arrys is "+secLarg);
    	
    }
    //9 second minimum element without shorting
    public void secondMinimum(int arr[])
    {
    	int i=0,min=arr[0],secMin=arr[0];int j=0;
    	while(i<arr.length) {
    		if(arr[i]<min) {
    			min=arr[i]; 
    			 j=i;
    			}
    		i++;
    	}
    	System.out.println(" minimum element is "+min);
    	System.out.println("position of  minimum element is "+(j+1));
    	int k =0;
    	//j=i;
    	while(k<arr.length) {
    		if(k!=j)
    		{ 
    			if(arr[k]<secMin) {
    		
    				secMin=arr[k];
    		    	System.out.println("second minimum(inside) element is "+ secMin);

    			}
    	    }
    		else
    			System.out.println("else print "+arr[k]);
    		k++;
    	}
    	System.out.println("second minimum element is "+ secMin);
    }
    	
    //10 DELETE ELEMENT FROM GIVE PLACE
    		
    public void deleteArrayElements(int arr[],int pos) {
    	int n= arr.length;
    	for( int i=pos-1;i<arr.length-1;i++) {
    		arr[i]= arr[i+1];
    	}
    	n--;
    	System.out.println(n);
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
        // confusion ? why last element is not deleted  
    	System.out.println(Arrays.toString(arr));
    	
    	
    }
    // 11 cheack prime or not
    public void primeOrNot(int a[]) {
    	for(int i =0;i<a.length;i++) {
    		boolean flag = true;
    		if(a[i]==1) {
    			System.out.println("not a prime number");
    		}
    		for(int j=2;j<Math.sqrt(a[i]);j++) {
    			if(a[i]%j==0) {
    				flag=false;
    				break;
    			}
    		}
    		if(flag==false) {
    			System.out.println(a[i]+" is not a prime number");
    		}
    		else
    			System.out.println(a[i]+" is a prime number");
    	}
    	
    }
}
    	
    			
    			
public class AllArrayAssignment1D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter sie of arry");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("please enter element of arrys");
		for (int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		arraysProblems obj = new arraysProblems();
		//obj.maximumValue(a);
		//obj.reverseItSelf(a);
		//obj.palindrome(a);
		//obj.maximumMinimum(a);
		//obj.evenOddArrays(a);
		//obj.insertElement(a,15);
		//obj.secondLargest(a);
		//obj.deleteArrayElements(a,4);
		//obj.secondMinimum(a);
		obj.primeOrNot(a);
		
		
	}
	
}

	
		
