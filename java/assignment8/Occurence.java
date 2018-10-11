import java.util.Scanner;
class Occ
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string to be checked)");
		String str1 = sc.nextLine();
		System.out.println("Enter the next string");
		String str2 = sc.nextLine();

		boolean ans = str2.contains(str1);

		if(ans==false)
		{
			System.out.println(str1+" is absent in "+str2);
		}
		else
		{
			System.out.println(str1+" is present in "+str2);
		}	
	}
}