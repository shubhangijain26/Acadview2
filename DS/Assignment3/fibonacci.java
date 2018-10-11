import java.util.Scanner;


public class fibonacci {

	public static int sumf(int a,int b,int N)
	{
		
		if(N>1)
		
		{
			
			int sum=a+b;
		
		a=b;
		b=sum;
		return sumf(a,b,N-1);
		}
		else
		{
			return b;
		}
		
	}
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
	
		int a=1,b=1;
		
		
		
       int c= sumf(a,b,N);
		System.out.println(c);
		sc.close();
	}

}
