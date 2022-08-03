package com.String;
import java.util.Arrays;
class CountChar{
	public void frequencey(String str) {
		
			
			String ch[] = str.split("");  //two program 1 ="",2=" "   *********
		
		int fr[] = new int[ch.length];
		for(int i=0;i<ch.length;i++) {
			fr[i]=1;
		}
		for( int i=0;i<ch.length-1;i++) {
			int cnt=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i].equals(ch[j])) {
					cnt++;
					fr[j]=0;    //ch[j] also be deleted
					//fr[i]=cnt;
					//ch[j]=" ";
					
				}
			}
			if(fr[i]!=0) {
				fr[i]=cnt;
			}
			
			
				}
		System.out.println(Arrays.toString(fr));
		for(int i=0;i<fr.length;i++) {
			if(fr[i]!=0) {
				System.out.println(ch[i]+" occurance "+fr[i]+" times");
			
			}
        //find first non repeted charechtor
		/*for( i=0;i<fr.length;i++) {
			if(fr[i]==1) {
				System.out.println(ch[i]+" occurance "+fr[i]+" times");
				break;
			}*/
		}
	}
}

public class CharOccurance11 {

	public static void main(String[] args) {
		CountChar c = new CountChar();
		String s="@katariya_4art";
		c.frequencey(s);


	}

}
