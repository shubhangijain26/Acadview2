import java.util.Scanner;


public class WavePrintArray {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int a[][]=new int[20][20];
		
		int i,j;
		
		for(i = 0 ; i < N ; i++)
		{
			for(j=0 ; j < N ; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i = 0 ; i < N ; i++)
		{
			if(i%2==0)
			{
				for(j=0;j<N;j++)
				{
					System.out.print(a[i][j]+" ");
				}
			
			}
			
			else
			{
				for(j=N-1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
				}
				
			}
		}
		
		sc.close();

	}

}
