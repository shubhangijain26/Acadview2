import java.util.Scanner;


public class maxElement {

	public static int min(int a[],int n)
	{
		int max;
		max=a[0];
		
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int maximum=min(a,n);
		
		System.out.println("maximum value is : "+ maximum);
		sc.close();

	}

}
