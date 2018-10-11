import java.util.Scanner;


public class Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int N=sc.nextInt();
		System.out.println("Even numbers till "+N+" are:");
		for(i=1;i<N;i++)
		{
		if(i%2==0)
		{
			System.out.println(i);
		}
		}
		sc.close();

	}

}
