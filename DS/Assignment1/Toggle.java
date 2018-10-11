package dataStructure;

import java.util.Scanner;

public class Toggle {

	public static String tog(char a[])
	{
		int i;
		for(i=0;i<a.length;i++)

		  {
		     if(a[i]>='A'&&a[i]<='Z')
		       {
		          a[i]=(char)(a[i]+32);
		       }
		     else if(a[i]>='a'&&a[i]<='z')
		        {
		          a[i]=(char) (a[i]-32);
		        }
		  }
		return a.toString();
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		char[] a=s.toCharArray();
		
		tog(a);     //Calls the function o toggle
		
		System.out.println(a);
		sc.close();
	}

}
