

public class Prime {

	public static void main(String[] args) {
		int i,N=21,c=0;

		
			for(i=1;i<=N;i++)
			{
			if(N%i==0)
			{
				c++;
			}
			}
			
			if(c==2)
			{
				System.out.println(N+" is a prime number");
			}
			else
			{
				System.out.println(N+" is NOT a prime number");
			
		}

	}

}
