import java.util.Scanner;
class Vowel
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String a = sc.nextLine();

		a = a.replaceAll("[AEIOUaeiou]","");
		System.out.println("STRING IS "+a);
	}
}