import java.util.Scanner;
class Words
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.nextLine();

		int flag=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' '  && str.charAt(i+1)!=' ')
			{
				flag++;
			}
		}
		System.out.println("There are "+flag+" words in "+str);
	}
}