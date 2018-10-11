import java.util.Scanner;


public class power {

	public static int pow(int x,int y,int a)
	{
		
		if(y==0)
			
		return a;
		 
		else
		  a=a*x;
		  return pow(x,y-1,a);
	}
	
	
	public static void main(String[] args) {
		  
Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		
		int y=sc.nextInt();
		int a=1;
		int b=pow (x,y,a);
		
		System.out.println(b);
		sc.close();

	}

}
