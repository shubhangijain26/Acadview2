import java.util.*;

public class TotalOfDigits {

	public static int calSum(int num ,int s)
	{
		
		if(num>0){
			
			s+=(num%10);
			
			return calSum(num/10, s);
		}
		else
			return s;
	}
	
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String str = ip.nextLine();
		
		int num = Integer.parseInt(str);
		
		System.out.println("The sum of number is " + calSum(num,0));
		
		ip.close();
	}


}