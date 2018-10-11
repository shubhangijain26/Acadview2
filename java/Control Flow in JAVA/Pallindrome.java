


public class Pallindrome {

	public static void main(String[] args) {
		int r,rev=0;
		
		int N=131,m;
		m=N;
		while(N!=0)
		{
			r=N%10;
			rev=(rev*10)+r;
			N=N/10;
		}
if(m==rev)
{
	System.out.println(m+" is pallindrome");
}
else
{
	System.out.println(m+" is not a pallindrome");
}
	}

}
