import java.util.Scanner;


public class Armstrong {

	public static void main(String[] args) 
	{
		int r,digits=0,num;
		double a=0;
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		num=N;
		while(num!=0)
		{
			r=num%10;
			
			num=num/10;
			digits++;
		}
		num=N;
		while(num!=0)
		{
			r=num%10;
			num=num/10;
			a=a+(Math.pow(r,digits));
		}
		if(a==N)
		{
		System.out.println(N+" is armstrong");
		}
		else
		{
			System.out.println(N+" is NOT armstrong");
		}
		sc.close();
	}

}
