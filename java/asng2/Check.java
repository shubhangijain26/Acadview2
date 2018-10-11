import java.util.Scanner;


public class Check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[12];
		int i,j,flag=0;
		a[0]=1;
		a[1]=4;
		a[2]=6;
		a[3]=7;
		a[4]=8;
		a[5]=9;
		a[6]=10;
		for(i=0;i<7;i++)
		{
			for(j=0;j<7;j++)
			{
				if(N==a[i])
				{
					flag=1;
				}
			}
			
	    }
		if(flag==1)
		{
			System.out.println(N+" is present in the array");
		}
		else
		{
			System.out.println(N+" is NOT present in the array");
		}
		sc.close();
	}
}
\