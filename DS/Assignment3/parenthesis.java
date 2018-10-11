package dataStructure;

import java.util.Scanner;

class stack1
{
	int top;
	char arr[];
	
	stack1()
	{
		top=-1;
		arr=new char[100];
	}
	
	public void push(char data)
	{
		if(top==arr.length-1)
		{
			System.out.println("stack overflow");
		}
		else
		{
			arr[++top]=data;
		}
	}
	public char pop()
	{
	if(top==-1)
	{
		System.out.println("stack underflow");
		return 0 ;
	}
	else
	{
		return arr[top--];
	}
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
           return true;
		else
			return false;
	}
	
	
}

public class parenthesis {

	public static boolean check(char a,char b)
	{
		if(a=='('&&b==')')
			return true;
		if(a=='['&&b==']')
			return true;
			if(a=='{'&&b=='}')
				return true;
			
			else
				return false;
	}
	
	
	public static boolean  isBalanced(char str[])
	{
		int i;
		stack1 s=new stack1();
		for(i=0;i<str.length;i++)
		{
			if(str[i]=='('||str[i]=='{'||str[i]=='[')
			{
				s.push(str[i]);
			}
			
			if(str[i]==')'||str[i]=='}'||str[i]==']')
			{
				if(s.isEmpty())
					return false;
				
				else
				{
					
					
					if(!check(s.pop(),str[i]))
						return false;
				}
			}
		}
		
		if(s.isEmpty())
			return true;

		else
			return false;
		
	}
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		String ab=sc.next();
	
		char str[]=ab.toCharArray();
		
		if(isBalanced(str))
			System.out.println("balanced");
		
		else
			System.out.println("Not Blanaced");
		
		sc.close();
		
	}

}
