import java.util.Scanner;
class Sub
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j;

		System.out.println("Enter the string");
		String input = sc.nextLine();

		for(i=0;i<input.length();i++)
		{
			for(j=i+1;j<=input.length();j++)
			{
				System.out.println(input.substring(i,j));
			}
		}
	}
}