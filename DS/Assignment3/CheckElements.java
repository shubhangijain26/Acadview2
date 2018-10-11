import java.util.Scanner;


public class CheckElements {

	public static boolean isThere(int a[],int M,int index)
	{
		if(index<a.length)
		{
		
		    if(M==a[index])
		      {
			    return true;
			    
			  }
		   
		    return isThere(a,M,index+1);
		}
		else
		{
			return false;
		}
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

		int M=sc.nextInt();
		
		boolean ans=isThere(a,M,0);
		
		System.out.println(ans);
		
		sc.close();
	}

}
