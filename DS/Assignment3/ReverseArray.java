 import java.util.Scanner;


public class ReverseArray {

	public static int reverse(int a[],int N)
	{
		if(N<=0)
			return 0;
		
			System.out.print(a[N-1]+" ");
			return reverse(a,N-1);
		 
		
	}
	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int a[]=new int[12];
		
		int i;
		
		for(i = 0 ; i < N ; i++)
		{
			a[i]=sc.nextInt();
		}

		reverse(a,N);
		
		
		sc.close();
	}

}
