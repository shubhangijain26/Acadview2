
public class leapYear {

	public static void main(String[] args) {
		int year=1800;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println(year+" is a leap year");
				}
				else
				{
					System.out.println(year+" is NOT a leap year");
				}
			}
			else
			{
				System.out.println(year+" is NOT a leap year");
			}
		}
		else
		{
			System.out.println(year+" is NOT a leap year");
		}

	}

}
