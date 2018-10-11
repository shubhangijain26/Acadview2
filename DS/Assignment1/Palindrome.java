import java.util.Arrays;
import java.util.Scanner;


public class Palindrome {

	public static boolean check(char e[],char d[])
	{
		
		if(Arrays.equals(d,e))		
		{		
			return true;			
		}
		
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
		String s=sc.next();
		
		char[] d=s.toCharArray();
		
		char[] e=new char[d.length];
		
		int i,j,len;
		
		len=s.length();
		
		for(i=0,j=len-1;i<len;i++,j--)
		{
			e[j]=d[i];                        //reverse the string 
		}
		
		boolean a=check(e,d); //checks weather string is palindrome or not.
		
		System.out.println(a);
		
    sc.close();
	}

}
