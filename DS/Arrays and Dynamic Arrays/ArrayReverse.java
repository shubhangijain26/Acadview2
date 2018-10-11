import java.util.Scanner;

public class ArrayReverse {

	public static void reverse(int a[],int b[],int N)
	{
		int i,j;
		
		for(i=0,j=N-1;i<N;i++,j--)
		{
			b[j]=a[i];
		}
	}

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int a[]=new int[N+1];
		
		int b[]=new int[N+1];
		
		int i;
		
		for(i = 0 ; i < N ; i++)
		{
			a[i]=sc.nextInt();
		}

		reverse(a,b,N);         //calls the function to reverse the array
		
		System.out.println("Reversed array is :");
		
		for(int k=0;k<N;k++)
		{
			System.out.print( b[k]+" ");
		}
		
		sc.close();

	}

}








