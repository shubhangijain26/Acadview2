import java.util.Scanner;


public class Reverse {

	public static void main(String[] args) {
		int r,rev=0;
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		while(N!=0)
		{
			r=N%10;
			rev=(rev*10)+r;
			N=N/10;
		}
		System.out.println("Reversed number is: "+rev);
		sc.close();
	}

}
