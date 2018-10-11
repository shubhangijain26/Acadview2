import java.util.Scanner;


public class DuplicateRemove {

	public static void remove(char a[],int x,int n)
	{
		for(int i=x;i<n-1;i++)
		{
			a[i]=a[i+1];
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		char a[]=new char[str.length()+1];
		 
		a=str.toCharArray();
		
		int i,j;
		
		int n=str.length();
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;)
			{
				
				if(a[i]==a[i+1])
				{
					remove(a,j,n);
					n--;
				}
				else
				{
					j++;
				}
			}
		}
		for(i=0;i<n;i++)
		{
		System.out.print(a[i]);
		}
		sc.close();

	}

}
